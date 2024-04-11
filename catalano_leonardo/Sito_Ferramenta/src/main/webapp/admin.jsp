<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.io.BufferedReader" %>
<%@ page import="java.io.FileReader" %>
<%@ page import="java.io.IOException" %>
<%
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
    response.setHeader("Pragma", "no-cache"); // HTTP 1.0.
    response.setDateHeader("Expires", 0); // Proxies.
%>
<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Amministrazione utenti</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f8f9fa;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 800px;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #333;
            text-align: center;
            margin-bottom: 30px;
        }
        .utente {
            border: 1px solid #e9ecef;
            padding: 20px;
            margin-bottom: 20px;
            border-radius: 8px;
            background-color: #fff;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        .utente p {
            margin: 0;
            font-size: 18px;
        }
        .utente p:first-child {
            font-weight: bold;
            margin-bottom: 10px;
        }
        .utente form {
            margin-top: 15px;
            text-align: center;
        }
        .bottone {
            background-color: #007bff;
            color: #fff;
            padding: 10px 20px;
            font-size: 16px;
            border: none;
            cursor: pointer;
            border-radius: 5px;
            text-decoration: none;
            transition: background-color 0.3s ease;
        }
        .bottone:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Utenti registrati</h1>
        <%
     	
        ServletContext context = request.getServletContext();
       
        String registrazioneFilePath = context.getRealPath("/registrazioni.txt");
        System.out.println(registrazioneFilePath);
        ArrayList<String[]> utenti = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(registrazioneFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 3) {
                    String storedUsername = parts[0];
                    String storedPassword = parts[1];
                    String ruolo = parts[2];
                    utenti.add(new String[]{storedUsername, storedPassword, ruolo});
                }
            }
        } catch (IOException e) {
            out.println("Errore durante la lettura dei dati " + e.getMessage());
        }
            
        %>
        <form action="cancellaUtenti.jsp" method="post">
                <% for (String[] utente : utenti) { %>
		            <div class="utente">
		            <% if(!utente[2].equals("amministratore")) {%>
		            <input type="checkbox" id="<%= utente[0] %>" name="utenteSelezionato" value="<%= utente[0] %>"><br>
		            <% } %>
		            <label for="<%= utente[0] %>">Username: <%= utente[0] %></label><br>
		            <label for="<%= utente[1] %>">Password: <%= utente[1] %></label><br>
		            <label for="<%= utente[2] %>">Ruolo: <%= utente[2] %></label><br>
		            </div>
        		<% } %>
        	<input type="submit" class="bottone" value="Cancella Utenti Selezionati">
        	<input type="button" class="bottone" value="Torna alla Home" onclick="window.location.href='index.jsp';">
        </form>
    </div>
</body>



</html>

