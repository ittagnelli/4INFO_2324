<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.io.BufferedReader, java.io.FileReader, java.io.IOException, java.util.ArrayList,javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html lang="it">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Acquisto Confermato</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
            background-color: #f5f5f5;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }
        .container {
            max-width: 600px;
            background-color: #fff;
            padding: 100px;
        }
        h1, h2, h3 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }
        a {
            display: block;
            width: fit-content;
            margin: 20px auto 0;
            padding: 12px 24px;
            color: #fff;
            background-color: #007bff;
            border: none;
            border-radius: 4px;
            text-decoration: none;
        }
        a:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Acquisto Confermato</h1>
        <h2>Grazie per il tuo acquisto!</h2>

        <h3>Prodotti Acquistati:</h3>
        <ul>
            <% 
                HttpSession sessione = request.getSession(true);
                ArrayList<String> prodottiAcquistati = (ArrayList<String>) session.getAttribute("carrello");
                double prezzoTotale = 0.0;

                if (prodottiAcquistati != null && !prodottiAcquistati.isEmpty()) {
                    for (String prodotto : prodottiAcquistati) {
                        out.println("<li>" + prodotto + "</li>");

                       
                        String[] p = prodotto.split(" - Prezzo: € ");
                        if (p.length == 2) {
                            String prezzoString = p[1].replaceAll("[^\\d.,]+", "");
                            double prezzoProdotto = Double.parseDouble(prezzoString.replace(",", "."));
                            prezzoTotale += prezzoProdotto;
                        }
                    }
                }
                session.invalidate();
            %>
        </ul>

        <h3>Prezzo Totale: € <%= String.format("%.2f", prezzoTotale) %></h3>

        
        <a href="index.jsp">Torna nella HOME</a>
    </div>
</body>
</html>
