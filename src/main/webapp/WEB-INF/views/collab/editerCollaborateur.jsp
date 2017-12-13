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
	<form method=POST>
	  <div class="form-group">
	    <label for="nom">Nom</label>
	    <input type="text" id="nom" name="nom" class="form-control" required>
	  </div>
	  <div class="form-group">
	    <label for="prenom">Prenom</label>
	    <input type="text" id="prenom" name="prenom" class="form-control" required>
	  </div>
	  <div class="form-group">
	    <label for="dateDeNaissance">Date de Naissance</label>
	    <input type="date" id="dateDeNaissance" name="dateDeNaissance" class="form-control" required>
	  </div>
	  <div class="form-group">
	    <label for="adresse">Adresse</label>
	    <input type="text" id="adresse" name="adresse" class="form-control" required>
	  </div>
	  <div class="form-group">
	    <label for="numeroSecuriteSociale">Numéro de sécurité sociale</label>
	    <input type="text" id="numeroSecuriteSociale" name="numeroSecuriteSociale" class="form-control" required>
	  </div>
	  <button type="submit" class="btn btn-primary">Créer</button>
	</form>

</body>
</html>