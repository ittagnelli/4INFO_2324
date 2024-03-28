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
        <link rel="stylesheet" href="/registroSmalMacaluso/css/style_addDocente.css">
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
                    <h3 id="nome_docente">Add docente</h3>
                    <input type="text" placeholder="Inserisci nome" class="input-text" name="inputNome" >
                    <input type="text" placeholder="Inserisci cognome" class="input-text" name="inputCognome" >
                    <input type="password" placeholder="Inserisci password" class="input-text" name="inputPass" >
                    <textarea placeholder="Inserisci materie
Es: italiano, storia, ..." class="input-text materie-inserimento" name="inputMaterie"></textarea>
                    <div class="scelta">
                        <button class="buttom-scelta" name="ritornaHome">Home</button>
                        <button class="buttom-scelta" name="addNewDocente"><img class="img-input" src="/registroSmalMacaluso/imgs/add_logo.png"></button>
                    </div>
                </div>
            </div>
        </form>
        
        <% 
        	if ((request.getParameter("addNewDocente") != null) && (request.getParameter("inputMaterie") != null) && 
        			(request.getParameter("inputNome") != null) && (request.getParameter("inputCognome") != null) && 
        			(request.getParameter("inputPass") != null)) {
        		Writer wfDocente = new Writer(request.getServletContext().getRealPath("/infoTXT") + PathNAME.PATH_INSEGNANTI, true);
        		Docente docente = new Docente(request.getParameter("inputNome"),
        									request.getParameter("inputCognome"),
        									request.getParameter("inputMaterie"),
        									request.getParameter("inputPass"));
        		System.out.println(docente);
        		wfDocente.addLine(docente.toString());
        		wfDocente.closeFile();
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
