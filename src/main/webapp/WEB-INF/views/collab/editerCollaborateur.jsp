<%@ page import="java.util.List" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/bootstrap.css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/js/bootstrap.js">
	<title>SGP - App</title>
</head>
<body>

	<h1>Nouveau Collaborateur</h1>
	
	<div class="container">

	
		<form method=POST>
		  <div class="form-group row">
		    <label for="nom" class="col-sm-2 col-form-label">Nom</label>
		    <div class="col-sm-6 input-group">
		    	<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
		    	<input type="text" id="nom" name="nom" class="form-control" required>
		    </div>
		  </div>
		  <div class="form-group row">
		    <label for="prenom" class="col-sm-2 col-form-label">Prenom</label>
		    <div class="col-sm-6 input-group">
		    	<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
		    	<input type="text" id="prenom" name="prenom" class="form-control" required>
		    </div>
		  </div>
		  <div class="form-group row">
		    <label for="dateNaissance" class="col-sm-2 col-form-label">Date de Naissance</label>
		    <div class="col-sm-6 input-group">
		    	<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
		    	<input type="date" id="dateNaissance" name="dateNaissance" class="form-control" required>
		    </div>
		  </div>
		  <div class="form-group row">
		    <label for="adresse" class="col-sm-2 col-form-label">Adresse</label>
		    <div class="col-sm-6 input-group">
		    	<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
		    	<input type="text" id="adresse" name="adresse" class="form-control" required>
		    </div>
		  </div>
		  <div class="form-group row">
		    <label for="numeroSecuriteSociale" class="col-sm-2 col-form-label">Numéro de sécurité sociale</label>
		    <div class="col-sm-6 input-group">
		    	<span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
		    	<input type="text" id="numeroSecuriteSociale" name="numeroSecuriteSociale" class="form-control" required>
		    </div>
		    <small class="text-muted">Doit contenir 15 chiffres</small>
		  </div>
		  <div class="col-sm-offset-6">
		  	<button type="submit" class="btn btn-primary">Créer</button>
		  </div>
		</form>
	</div>

</body>
</html>