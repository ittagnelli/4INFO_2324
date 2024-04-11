<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Prodotti</title>
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
        }
        h1 {
            color: #333;
            text-align: center;
            margin-bottom: 30px;
        }
        .prodotto {
            border: 1px solid #e9ecef;
            padding: 20px;
            margin-bottom: 20px;
            border-radius: 8px;
            background-color: #fff;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
        }
        .prodotto p {
            margin: 0;
            font-size: 18px;
        }
        
        .prodotto form {
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
        }
        .bottone:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Prodotti Disponibili</h1>
        <% ArrayList<String[]> prodotti = new ArrayList<>();
           prodotti.add(new String[]{"Martello", "20$"});
           prodotti.add(new String[]{"Cacciavite", "5$"});
           prodotti.add(new String[]{"Sega", "20$"});
           prodotti.add(new String[]{"Vite", "1.25$"});
           prodotti.add(new String[]{"Vernice", "20$"});
           prodotti.add(new String[]{"Levigatrice", "30$"});
           prodotti.add(new String[]{"Trapano", "40$"});
           prodotti.add(new String[]{"Compressore ad aria", "10$"});
           prodotti.add(new String[]{"Dado", "1.50$"});
           for (String[] prodotto : prodotti) {
        %>
        <div class="prodotto">
            <p><%= prodotto[0] %></p>
            <p>Prezzo: <%= prodotto[1] %></p>
            <form target="hiddenFrame" action="carrello.jsp" method="post">
                <input type="hidden" name="prodotto" value="<%= prodotto[0] %>">
                <input type="hidden" name="prezzo" value="<%= prodotto[1] %>">
                <button class="bottone" type="submit">Aggiungi al Carrello</button>
            </form>
        </div>
        <% } %>
        <form action="carrello.jsp">
            <button class="bottone" type="submit">Vai al Carrello</button>
        </form>
    </div>

    <iframe name="hiddenFrame" style="display:none;"></iframe>
</body>
</html>