<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, java.io.FileWriter, java.io.BufferedWriter, java.io.IOException" %>
<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Carrello</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f5f5f5;
        }
        .container {
            max-width: 600px;
            margin: auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            
        }
        h1 {
            text-align: center;
            margin-bottom: 20px;
        }
        ul {
            list-style-type: none;
            padding: 0;
        }
        li {
            margin-bottom: 10px;
            padding: 10px;
            background-color: #f9f9f9;
            border-radius: 4px;
        }
        a {
            display: inline-block;
            margin-top: 20px;
            text-decoration: none;
            padding: 10px 20px;
            background-color: #007bff;
            color: #fff;
            border-radius: 4px;
           
        }
        a:hover {
            background-color: #0056b3;
        }
    </style>
</head>

<body>
    <div class="container">
        <h1>Carrello</h1>
        <%
            String nuovoProdotto = request.getParameter("prodotto");
            String prezzoProdotto = request.getParameter("prezzo");

            if (nuovoProdotto != null && prezzoProdotto != null) {
                ArrayList<String> carrello = (ArrayList<String>) session.getAttribute("carrello");
                if (carrello == null) {
                    carrello = new ArrayList<String>();
                }
                
                carrello.add(nuovoProdotto + " - Prezzo: € " + prezzoProdotto);
                session.setAttribute("carrello", carrello);

              
                String filePath = "C:/Users/gcata/eclipse-workspace/Sito_Ferramenta/src/main/webapp/carrello.txt"; // Specifica il percorso del file
                try (FileWriter fileWriter = new FileWriter(filePath, true);
                     BufferedWriter writer = new BufferedWriter(fileWriter)) {
                    writer.write(nuovoProdotto + " - Prezzo: € " + prezzoProdotto);
                    writer.newLine(); 
                } catch (IOException e) {
                    out.println("<p>Errore durante il salvataggio del file " + e.getMessage() + "</p>");
                    e.printStackTrace(); 
                }
            }

            ArrayList<String> carrello = (ArrayList<String>) session.getAttribute("carrello");
            if (carrello != null && !carrello.isEmpty()) {
                out.println("<ul>");
                for (String prodotto : carrello) {
                    out.println("<li>" + prodotto + "</li>");
                }
                out.println("</ul>");
            } else {
                out.println("<p>Il carrello è vuoto</p>");
            }
        %>
        <br>
        <a href="acquista.jsp">Acquista</a>
    </div>
</body>
</html>

