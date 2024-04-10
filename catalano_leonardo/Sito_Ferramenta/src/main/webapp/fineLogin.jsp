<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Grazie per la registrazione</title>
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
        }
        
        input[type="button"]:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>Login effettuato correttamente</h1>
        <p>Ritorna nella HOME per vedere i nostri prodotti</p>
        <input type="button" value="Vai verso i prodotti" onclick="window.location.href='prodotti.jsp';">
    </div>
</body>
</html>