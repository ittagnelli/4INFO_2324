<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.tools_user.*" %>
<%@ page import="com.tools_file.*" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Registro | Home | Voto</title>
        <link rel="stylesheet" href="/registroSmalMacaluso/css/style_voti.css">
    </head>
    <body>
    	<%
    	Docente docente = (Docente)session.getAttribute("docenteTake");
    	Classe classe = new Classe(request.getServletContext().getRealPath("/infoTXT"));
		classe.loadClasse((String)session.getAttribute("classeTake"));
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
                    <h3 id="nome_docente">Inserimento voto</h3>
                    <select class="drop-down-menu" name="inputStudente" required>
                    	<option value="" disabled selected hidden>Studente</option>
                        <%
                        int contatore = 0;
                        for(Studente studente : classe.getClasse()) {
                        	%>
                        		<option value="<%= contatore++ %>"><%= studente.getNome() + " " + studente.getCognome() %></option>
                        	<%
                        }
                        %>
                    </select>
                    <select class="drop-down-menu" name="inputMateria" required>
                        <option value="" disabled selected hidden>Materia</option>
                        <%
                        for(String materie : docente.getMaterie()) {
                        	%>
                        		<option value="<%=materie %>"><%=materie %></option>
                        	<%
                        }
                        %>
                    </select>
                    <select class="drop-down-menu" name="inputVoto" required>
                        <option value="" disabled selected hidden>Inserire il voto</option>
                    <%for(float i = 2; i <= 10; i += .5) { 
                    %>
                    	<option value="<%= i %>"><%= i %></option>
                    
                    <% }
                    %>
                    </select>
                    <div class="scelta">
                        <button class="buttom-scelta" name="ritornaHome">Home</button>
                        <button class="buttom-scelta" name="mettiVoto"><img class="img-input" src="/registroSmalMacaluso/imgs/send_logo.png"></button>
                    </div>
                </div>
            </div>
        </form>
        
        <% 
        	if (request.getParameter("ritornaHome") != null) {
        		response.sendRedirect("homeDocente.jsp");
        	} 
        	if((request.getParameter("mettiVoto") != null) && (request.getParameter("inputVoto") != null) && 
        			(request.getParameter("inputMateria") != null) && (request.getParameter("inputStudente") != null)) {
        		WriterVoto wf = new WriterVoto(request.getServletContext().getRealPath("/infoTXT") + PathNAME.PATH_VOTI, true);
        		Studente studente = classe.getClasse().get(Integer.valueOf(request.getParameter("inputStudente")));
        		System.out.println(studente.getIndexStudente());
        		wf.addVoto(studente.getIndexStudente(), 
        					new Voto(request.getParameter("inputMateria") + "-" + request.getParameter("inputVoto")));
        		wf.closeFile();
      			%>
      			<script type="text/javascript">alert("Voto aggiunto con successo!")</script>
      			<%
        	}
        %>
        
    </body>
</html>
