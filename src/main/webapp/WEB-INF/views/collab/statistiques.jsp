<%@ page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/bootstrap.css">
<title>SGP - App</title>
</head>
<body>

	<ul class="nav nav-tabs">
	  <li role="presentation"><a href="<%=request.getContextPath()%>/collaborateurs/editer">Nouveau</a></li>
	  <li role="presentation"><a href="<%=request.getContextPath()%>/collaborateurs/lister">Lister</a></li>
	  <li role="presentation" class="active"><a href="#">Statistiques</a></li>
	</ul>

	<div class="container">

		<h1>Statistiques</h1>

		
		<table class="table table-bordered">
			<tr>
				<th>Chemin</th>
				<th>Nombre de visites</th>
				<th>Min (ms)</th>
				<th>Max (ms)</th>
				<th>Moyenne (ms)</th>
			</tr>
			<c:forEach var="visite" items="${visites}">
				<tr>
					<td>${visite.key}</td>
					<td>${visite.value.count}</td>
					<td>${visite.value.min}</td>
					<td>${visite.value.max}</td>
					<td>${visite.value.average}</td>
				</tr>
			</c:forEach>
		</table>

	</div>

</body>
</html>