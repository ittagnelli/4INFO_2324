<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="javax.servlet.http.HttpSession" %>
<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.io.FileReader" %>
<%@ page import="java.io.IOException" %>
<%@ page import="javax.servlet.ServletContext" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .login-container {
            width: 400px;
            padding: 40px;
            background-color: #fff;
            border-radius: 8px;
            text-align: center;
        }
        h1 {
            margin-bottom: 20px;
            color: #333;
        }
        form {
            display: flex;
            flex-direction: column;
            align-items: center;
        }
        label {
            margin-bottom: 10px;
            color: #555;
            font-weight: bold;
            display: block;
            width: 100%;
            text-align: left;
        }
        input[type="text"],
        input[type="password"],
        input[type="submit"] {
            width: 100%;
            padding: 12px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
            transition: border-color 0.3s ease;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
            transition: background-color 0.3s ease;
            border: none;
        }
        input[type="submit"]:hover {
            background-color: #0056b3;
        }
        .errore-del-messaggio {
            color: #d9534f;
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <div class="login-container">
        <h1>Accedi</h1>
        
       
        <%
            String username = request.getParameter("username");
            String password = request.getParameter("password");
           
            ServletContext context = request.getServletContext();            
            String registrazioneFilePath = context.getRealPath("/registrazioni.txt");
            
            if (username != null && password != null && !username.isEmpty() && !password.isEmpty()) {
                boolean credenzialiCorrette = false;
                String ruolo = null;
                try (BufferedReader reader = new BufferedReader(new FileReader(registrazioneFilePath))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        String[] parts = line.split(" ");
                        if (parts.length == 3) {
                            String storedUsername = parts[0];
                            String storedPassword = parts[1];
                            ruolo = parts[2];
                            System.out.println(storedUsername);
                            if (storedUsername.equals(username) && storedPassword.equals(password)) {
                                credenzialiCorrette = true;
                                break;
                            }
                        }
                    }
                } catch (IOException e) {
                    out.println("Errore durante la lettura dei dati " + e.getMessage());
                }

                if (credenzialiCorrette) {
                    HttpSession sessioni = request.getSession(true);
                    session.setAttribute("username", username);
                    if(ruolo != null && ruolo.equals("amministratore")) {
                    	response.sendRedirect("admin.jsp");
                    } else {
                    	response.sendRedirect("fineLogin.jsp");
                    }
                    return;
                } else {
                    
        %>
                    <p class="errore-del-messaggio">Credenziali non esatte</p>
        <%          
                }
            } else if (username != null || password != null) {
                
        %>
                <p class="errore-del-messaggio">Errore username o password non corretti</p>
        <%      
            }
        %>
        
        <form action="login.jsp" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required>
            <input type="submit" value="Login">
        </form>
    </div>
</body>
</html>