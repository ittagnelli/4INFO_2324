<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.FileWriter,javax.servlet.ServletContext,java.io.IOException" %>
<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Registrazione</title>
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
        .registrazione-container {
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
        a {
            display: block;
            width: fit-content;
            margin: 20px auto 0;
            padding: 12px 24px;
            color: #fff;
            background-color: #007bff;
            border: none;
            transition: background-color 0.3s ease;
            border-radius: 4px;         
            text-decoration: none;
            
        }
        a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");
     
        ServletContext context = request.getServletContext();
        
        String registrazioneFilePath = context.getRealPath("/registrazioni.txt");
		System.out.println(registrazioneFilePath);
        if (username != null && password != null && !username.isEmpty() && !password.isEmpty()) {
            try (FileWriter writer = new FileWriter(registrazioneFilePath, true)) {
                writer.write(username + " " + password + " cliente\n");
                writer.close();
    %>
                <div class="registrazione-con-successo">
                    <h1>Registrazione Completata</h1>
                    <p>Utente registrato</p>
                    <a href="index.jsp">Torna nella HOME</a>
                </div>
    <%
            } catch (IOException e) {
                out.println("Errore durante la registrazione " + e.getMessage());
            }
        } else {
    %>
        <div class="registrazione-container">
            <h1>Registrazione</h1>
            <form action="registrazione.jsp" method="post">
                <label for="username">Username:</label>
                <input type="text" id="username" name="username" required>
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
                <input type="submit" value="Registrazione">
            </form>
        </div>
    <% } %>
</body>
</html>
