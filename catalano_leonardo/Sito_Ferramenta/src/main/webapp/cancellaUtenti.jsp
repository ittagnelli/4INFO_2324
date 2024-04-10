<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList,java.io.IOException,java.io.FileWriter,java.io.FileReader,java.io.BufferedReader,java.util.Arrays" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cancellazione utenti</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f9f9f9;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            text-align: center;
        }
        .container {
            max-width: 400px;
            padding: 20px;
            background-color: #fff;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #333;
        }
        p {
            color: #666;
        }
        input[type="button"] {
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            transition: background-color 0.3s ease;
        }
        
        input[type="button"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
    <% String[] utentiSelezionati = request.getParameterValues("utenteSelezionato"); System.out.println(utentiSelezionati[0]);%>
    
    
    <% if (utentiSelezionati != null && utentiSelezionati.length > 0) { %>
        <%
        ServletContext context = request.getServletContext();
        String registrazioneFilePath = context.getRealPath("/registrazioni.txt");
        ArrayList<String[]> utenti = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(registrazioneFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length == 3) {
                    String storedUsername = parts[0];
                    boolean mantieniUtente = true;
                    for(String utente : utentiSelezionati) {
                    	if(utente.equals(storedUsername)) {
                    		mantieniUtente = false;
                    		break;
                    	}
                    }
                    if(mantieniUtente) {
                    	stringBuilder.append(line).append("\n");
                    }
                }
            }
            System.out.println("utenti da tenere ");
            System.out.println(stringBuilder.toString());
        } catch (IOException e) {
            out.println("errore durante la lettura dei dati " + e.getMessage());
        }
        
        try (FileWriter writer = new FileWriter(registrazioneFilePath) ) {
        	writer.write(stringBuilder.toString());
            writer.close();
        } catch (IOException e) {
            out.println("errore durante la lettura dei dati " + e.getMessage());
        }
        %>
        <p>Utenti cancellati: <%= Arrays.toString(utentiSelezionati) %></p>
        <p>Ritorna nella pagina utenti</p>
        <input type="button" value="Vai alla pagina di amministrazione utenti" onclick="window.location.href='admin.jsp';">
        
    <% } else { %>
        <p>Nessun utente selezionato</p>
    <% } %>
    	
        
    </div>
</body>
</html>