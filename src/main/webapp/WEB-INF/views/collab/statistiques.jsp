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

	<div class="container-fluid">

		<h1>Statistiques</h1>

		
		<table class="table table-bordered">
			<tr>
				<th>Chemin</th>
				<th>Nombre de visites</th>
				<th>Min (ms)</th>
				<th>Max (ms)</th>
				<th>Moyenne (ms)</th>
			</tr>
			<tr>
				<td>Alfreds Futterkiste</td>
				<td>Maria Anders</td>
				<td>Germany</td>
				<td>Germany</td>
				<td>Germany</td>
			</tr>
		</table>

	</div>

</body>
</html>