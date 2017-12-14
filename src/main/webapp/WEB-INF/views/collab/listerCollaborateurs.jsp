<%@ page import="java.util.List" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="dev.sgp.entite.Collaborateur" %>
<%@ page import="dev.sgp.service.CollaborateurService" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/bootstrap.css">
	<title>SGP - App</title>
</head>
<body>

	<div class="container">
	
		<h1>Liste des collaborateurs</h1>
		
		<form method=POST>
			<div class="form-group">
				<label for="filtre">Filtre</label>
				<input type="text" id="filtre" name="filtre" class="form-control">
			</div>
			<div class="col-sm-offset-6">
			  	<button type="submit" class="btn btn-primary">Rechercher</button>
			  </div>
		</form>
		
		<div class="checkbox">
			<label><input type="checkbox" value="">Voir les collaborateurs désactivés</label>
		</div>
	
		<label class="mr-sm-2" for="inlineFormCustomSelectPref">Departement</label>
		<select class="custom-select">
			<c:forEach var = "dept" items="${departements}">
				<option value="1">${ dept.nom }</option>
			</c:forEach>
		</select>
		
		
		<c:forEach var = "collab" items="${collaborateurs}">
			<div class="col-sm-4">
				<div class="card img-fluid" class="center-div">
					<img class="card-img-top" width="250" height="250" src="${collab.photo}">
					<div class="card-img-overlay">
						<h4 class="card-title">Mr. ${collab.nom}</h4>
						<p class="card-text">${collab}</p>
					</div>
				</div>
			</div>
		</c:forEach>
		
	
	</div>
	
</body>
</html>