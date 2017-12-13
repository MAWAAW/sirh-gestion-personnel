<%@ page import="java.util.List" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/boostrap.css">
	<title>SGP - App</title>
</head>
<body>

	<h1>Nouveau Collaborateur</h1>
	<form method="POST" target="_blank">
		Nom <input type="text" name="nom" required>
		<br>
		Prenom <input type="text" name="prenom" required>
		<br>
		Date de naissance <input type="text" name="dateDeNaissance" required>
		<br>
		Adresse <input type="text" name="adresse" required>
		<br>
		Numéro de sécurité sociale <input type="text" name="numeroSecuriteSociale" required>
		<br>
		<input type="submit" value="Créer">
	</form> 

</body>
</html>