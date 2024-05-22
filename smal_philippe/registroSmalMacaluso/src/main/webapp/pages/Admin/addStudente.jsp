<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.tools_file.*" %>
<%@ page import="com.tools_user.*" %>
<%@ page import="com.tools_user.User" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Registro | Home | add</title>
        <link rel="stylesheet" href="/registroSmalMacaluso/css/style_addStudente.css">
    </head>
    <body>
    	<%
    	User admin = (User)session.getAttribute("adminTake");
    	%>
        <form class="card">
            <h2 id="title-card">Home - Admin</h2>
            <div class="user-card">
                <h3 id="nome_docente"><%=admin.getNome() + " " + admin.getCognome() %></h3>

                <div class="input-inserimento-classe">
                    <h3 id="nome_docente">Add studente</h3>
                    <input type="text" placeholder="Inserisci nome" class="input-text" name="inputNome" required>
                    <input type="text" placeholder="Inserisci cognome" class="input-text" name="inputCognome" required>
                    <input type="password" placeholder="Inserisci password" class="input-text" name="inputPass" required>
                    <select class="drop-down-menu" name="inputClasse" required>
                        <option value="" disabled selected hidden>Inserire la classe</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select>
                    <select class="drop-down-menu" name="inputSezione" required>
                        <option value="" disabled selected hidden>Inserire la sezione</option>
                        <option value="Informatica">Informatica</option>
                        <option value="Energia">Energia</option>
                        <option value="Meccanica">Meccanica</option>
                        <option value="Elettronica">Elettronica</option>
                    </select>
                    <div class="scelta">
                        <button class="buttom-scelta" name="ritornaHome">Home</button>
                        <button class="buttom-scelta" name="addNewStudente"><img class="img-input" src="/registroSmalMacaluso/imgs/add_logo.png"></button>
                    </div>
                </div>
            </div>
        </form>
        <% 
        	if ((request.getParameter("addNewStudente") != null) && (request.getParameter("inputSezione") != null) && 
        			(request.getParameter("inputClasse") != null) && (request.getParameter("inputNome") != null) &&
        			(request.getParameter("inputCognome") != null) && (request.getParameter("inputPass") != null)) {
        		Writer wfStrudente = new Writer(request.getServletContext().getRealPath("/infoTXT") + PathNAME.PATH_STUDENTI, true);
        		Writer wfVoto = new Writer(request.getServletContext().getRealPath("/infoTXT") + PathNAME.PATH_VOTI, true);
        		Studente studente = new Studente(request.getParameter("inputNome"),
        									request.getParameter("inputCognome"),
        									request.getParameter("inputSezione"),
        									Integer.valueOf(request.getParameter("inputClasse")),
        									request.getParameter("inputPass"));
        		System.out.println(studente);
        		wfStrudente.addLine(studente.toString());
        		wfVoto.addLine("null");
        		wfVoto.closeFile();
        		wfStrudente.closeFile();
      			%>
      			<script type="text/javascript">alert("Creazione avvenuta con successo!")</script>
      			<%
        	}
        
	    	if (request.getParameter("ritornaHome") != null) {
	    		response.sendRedirect("homeAdmin.jsp");
	    	} 
        	
        %>
    </body>
</html>
