<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.tools_user.Docente" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Registro | Home - docente</title>
        <link rel="stylesheet" href="/registroSmalMacaluso/css/style_docente.css">
    </head>
    <body>
    	<%
    	Docente docente = (Docente)session.getAttribute("docenteTake");
    	%>
        <form class="card">
            <h2 id="title-card">Home - Docente</h2>
            <div class="user-card">
                <div class="info-div">
                    <h3 id="nome_docente"><%=docente.getNome() + " " + docente.getCognome() %></h3>
                    <ul>
                        <%
                        for(String materie : docente.getMaterie()) {
                        	%>
                        		<li><%=materie %></li>
                        	<%
                        }
                        %>
                    </ul>
                </div>
                <div class="input-inserimento-classe">
                    <h3 id="nome_docente">Voto</h3>
                    <select class="drop-down-menu" name="inputSezione">
                        <option value="" disabled selected hidden>Classe</option>
                        <option value="1 Informatica">1 Informatica</option>
                        <option value="2 Informatica">2 Informatica</option>
                        <option value="3 Informatica">3 Informatica</option>
                        <option value="4 Informatica">4 Informatica</option>
                        <option value="5 Informatica">5 Informatica</option>
                        <option value="1 Energia">1 Energia</option>
                        <option value="2 Energia">2 Energia</option>
                        <option value="3 Energia">3 Energia</option>
                        <option value="4 Energia">4 Energia</option>
                        <option value="5 Energia">5 Energia</option>
                        <option value="1 Meccanica">1 Meccanica</option>
                        <option value="2 Meccanica">2 Meccanica</option>
                        <option value="3 Meccanica">3 Meccanica</option>
                        <option value="4 Meccanica">4 Meccanica</option>
                        <option value="5 Meccanica">5 Meccanica</option>
                        <option value="1 Elettronica">1 Elettronica</option>
                        <option value="2 Elettronica">2 Elettronica</option>
                        <option value="3 Elettronica">3 Elettronica</option>
                        <option value="4 Elettronica">4 Elettronica</option>
                        <option value="5 Elettronica">5 Elettronica</option>
                    </select>
                    <div class="scelta">
                        <button class="buttom-scelta" name="ritornaHome">Home</button>
                        <button class="buttom-scelta" name="inserisciVoto">Fai l'appello</button>
                    </div>
                </div>
            </div>
        </form>
        <% 
        	if (request.getParameter("inserisciVoto") != null) {
        		session.setAttribute("classeTake", request.getParameter("inputSezione"));
        		response.sendRedirect("votoDocente.jsp");
        	}
    	if (request.getParameter("ritornaHome") != null) {
    		response.sendRedirect("../../index.jsp");
    	} 
        %>
        
    </body>
</html>