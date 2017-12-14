<%@ page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page import="dev.sgp.entite.Collaborateur"%>
<%@ page import="dev.sgp.service.CollaborateurService"%>
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

		<h1>Liste des collaborateurs</h1>

		<div class="row">
			<div class="col-sm-12">
				<form class="form-inline">
					<div class="form-group">
						<label for="filtre">Rechercher un nom ou un prenom qui commence par: </label>
						<input type="text" class="form-control" id="filtre">
					</div>
					<button type="submit" class="btn btn-default">Rechercher</button>
					<div class="checkbox">
						<label><input type="checkbox">Voir les collaborateurs désactivés</label>
					</div>
				</form>
			</div>
		</div>
		
		<div class="row">
			<div class="col-sm-12">
				<div class="form-inline">
					<label for="departement">Filtrer par département: </label>
					<select class="custom-select">
						<option selected>Tous</option>
						<c:forEach var="dept" items="${departements}">
							<option>${ dept.nom }</option>
						</c:forEach>
					</select>
				</div>
			</div>
		</div>
	
		<c:forEach var="collab" items="${collaborateurs}">	
			<div class="panel panel-default col-sm-4">
	  			<!-- Default panel contents -->
	  			<div class="panel-heading">${collab.nom} ${collab.prenom}</div>
	  			<div class="panel-body">
	    			<img class="card-img-top" width="200" height="200" src="${collab.photo}">
	    			<p>${collab}</p>
	  			</div>
			</div>
		</c:forEach>


	</div>

</body>
</html>