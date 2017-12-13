<%@ page import="java.util.List" %>
<%@ page language="java" pageEncoding="UTF-8"%>*
<%@ page import="dev.sgp.entite.Collaborateur" %>
<%@ page import="dev.sgp.service.CollaborateurService" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/boostrap.css">
	<title>SGP - App</title>
</head>
<body>
	<h1>Les collaborateurs</h1>
	<ul>
	<%
	List<Collaborateur> collaborateurs = ((CollaborateurService)request.getAttribute("collabService")).listerCollaborateurs();
	for (Collaborateur collaborateur : collaborateurs) {
	%>
	<li><%= collaborateur %></li>
	<%
	}
	%>
	</ul>
</body>
</html>