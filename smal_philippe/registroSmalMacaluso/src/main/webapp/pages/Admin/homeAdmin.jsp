<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.tools_user.User" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Registro | Home - admin</title>
        <link rel="stylesheet" href="/registroSmalMacaluso/css/style_admin.css">
    </head>
    <body>
    	<%
    	User admin = (User)session.getAttribute("adminTake");
    	%>
        <form class="card">
            <h2 id="title-card">Home - Admin</h2>
            <div class="user-card">
                <div class="info-div">
                    <h3 id="nome_docente"><%=admin.getNome() + " " + admin.getCognome() %></h3>

                </div>
                <div class="input-inserimento-classe">
                    <h3 id="nome_docente">Crea account</h3>
                    <button class="buttom-scelta" name="addStudente"><img class="img-input" src="/registroSmalMacaluso/imgs/add_logo.png"> Aggiungi studente</button>
                    <button class="buttom-scelta" name="addDocente"><img class="img-input" src="/registroSmalMacaluso/imgs/add_logo.png"> Aggiungi docente</button>
                    <button class="buttom-scelta" name="addAdmin"><img class="img-input" src="/registroSmalMacaluso/imgs/add_logo.png"> Aggiungi admin</button>
                    <button class="buttom-scelta" name="ritornaHome">Home</button>
                </div>
            </div>
        </form>
        
        <% 
        	if (request.getParameter("addStudente") != null) response.sendRedirect("addStudente.jsp");
        	else if (request.getParameter("addDocente") != null) response.sendRedirect("addDocente.jsp");
        	else if (request.getParameter("addAdmin") != null) response.sendRedirect("addAdmin.jsp");
	    	if (request.getParameter("ritornaHome") != null) response.sendRedirect("../../index.jsp");
	    	 
        	
        %>
        
    </body>
</html>