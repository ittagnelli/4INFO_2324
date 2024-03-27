<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.tools_log.RicercaVoti" %>
<%@ page import="com.tools_user.*" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Registro | Home - studenti</title>
		<link rel="stylesheet" href="/registroSmalMacaluso/css/style_studente.css">
	</head>
	<body>
        <%
        	Studente studente = (Studente)session.getAttribute("studenteTake");
        %>
        <div class="card">
            <h2 id="title-card">Home - Studente</h2>
            <div class="user-card">
                <div class="info-div">
                    <h3 id="nome_studente"><%= (studente.getNome()  + " " + studente.getCognome()) %></h3>
                    <p id="sezione"><%= (studente.getClasse()  + " " + studente.getSezione()) %></p>
                </div>
                <div class="voti-div">
         <% 
         	RicercaVoti find = new RicercaVoti(request.getServletContext().getRealPath("/infoTXT"));
         	studente.setVoti((find.getListaVoti(studente.getIndexStudente())));
         	for(Voto voto : studente.getVoti()) { 
         		if(voto.getMateria().compareTo(RicercaVoti.MATERIA_NULL) != 0) {
         %>		
         			<div class="voto-box">
                        
                        <p id="voto"><%= voto %></p>
                        
                        <p id="materia"><%= voto.getMateria() %></p>
                    </div>
       	 <% 
         		}
         	}
         %>
                </div>
                
            </div>
        </div>
        
        
	</body>
</html>