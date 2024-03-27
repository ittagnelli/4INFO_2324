<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.tools_log.*"%>
<%@ page import="com.tools_user.*"%>
<!DOCTYPE html> 	
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Registro | LogIn</title>
		<link rel="stylesheet" href="/registroSmalMacaluso/css/style_login.css">
	</head>
	<body>
		<form method="post" class="card">
            <h2 id="title-card">LogIn</h2>
            <div class="input-log-card">
                <div class="input-text">
                    <img class="img-input" src="/registroSmalMacaluso/imgs/username_logo.png">
                    <label for="username" id="text-card">Username: </label>
                    <input type="text" id="input-username" name="username" >
                    <img class="img-input" src="/registroSmalMacaluso/imgs/password_logo.png">
                    <label for="pass" id="text-card">Password: </label>
                    <input type="password" id="input-username" name="pass" >
                </div>

                <select class="drop-down-user" name="userType">
                    <option value="3" disabled selected hidden>Tipo di user</option>
                    <option value="0">Admin</option>
                    <option value="1">Docente</option>
                    <option value="2">Studente</option>
                </select>
            </div>
            <button class="buttom-send" type="submit" name="eseguiScript"><img class="img-input" src="/registroSmalMacaluso/imgs/send_logo.png">  Accedi</button>
        </form>
        
    <%
        if ("POST".equalsIgnoreCase(request.getMethod()) && request.getParameter("eseguiScript") != null && request.getParameter("userType") != null) {
      		int userLevel = Integer.valueOf(request.getParameter("userType"));
      		System.out.println(request.getServletContext().getRealPath("/infoTXT"));
        	if(userLevel == 0) {
        		Login<User> lo = new Login<User>(request.getServletContext().getRealPath("/infoTXT"), 0);
        		if(lo.log(request.getParameter("username"), request.getParameter("pass"))) {
          			session.setAttribute("adminTake", lo.getPerson());
          			response.sendRedirect("pages/Admin/homeAdmin.jsp");	
          		} else {
          			%>
          			<script type="text/javascript">alert("Credenziali erratte")</script>
          			<% 
          		}
        	} else if(userLevel == 1) {
        		Login<Docente> lo = new Login<Docente>(request.getServletContext().getRealPath("/infoTXT"), 1);
        		if(lo.log(request.getParameter("username"), request.getParameter("pass"))) {
          			session.setAttribute("docenteTake", lo.getPerson());
          			response.sendRedirect("pages/Docente/homeDocente.jsp");	
          		} else {
          			%>
          			<script type="text/javascript">alert("Credenziali erratte")</script>
          			<%
          		}
        	} else if(userLevel == 2) {
        		Login<Studente> lo = new Login<Studente>(request.getServletContext().getRealPath("/infoTXT"), 2);
        		if(lo.log(request.getParameter("username"), request.getParameter("pass"))) {
          			session.setAttribute("studenteTake", lo.getPerson());
          			response.sendRedirect("pages/Studente/homeStudente.jsp");	
          		} else {
          			%>
          			<script type="text/javascript">alert("Credenziali erratte")</script>
          			<%
          		}
        	} else {
      			%>
      			<script type="text/javascript">alert("Scegliere il tipo di user");</script>
      			<%
        	}
            
        }
    
    	
    %>

	</body>
</html>