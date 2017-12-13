<%@ page import="java.util.List" %>
<%@ page language="java" pageEncoding="UTF-8"%>
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
	<h1>Liste des collaborateurs</h1>
	<ul>
	<%
	List<Collaborateur> collaborateurs = (List<Collaborateur>)request.getAttribute("collaborateurs");
	for (Collaborateur collaborateur : collaborateurs) {
	%>
	<li><%= collaborateur.getNom() %></li>
	<%
	}
	%>
	</ul>
</body>
</html>