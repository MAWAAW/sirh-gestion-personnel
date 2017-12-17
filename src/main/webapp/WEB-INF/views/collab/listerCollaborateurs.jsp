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
	  <li role="presentation" class="active"><a href="#">Lister</a></li>
	  <li role="presentation"><a href="<%=request.getContextPath()%>/collaborateurs/statistiques">Statistiques</a></li>
	</ul>


	<div class="container-fluid">

		<h1>Liste des collaborateurs</h1>

		<div class="container">
			<div class="row">
				<div class="col-sm-6">
					<div class="row">
						<div class="col-sm-6"><b>Recherche un nom ou un prenom qui commence par</b></div>
						<div class="col-sm-6">
							<input type="text" class="form-control">
						</div>
					</div>
					<div class="row">
						<div class="col-sm-6"><b>Filtre par departement</b></div>
						<div class="col-sm-6">
							<select class="custom-select">
								<option selected>Tous</option>
								<c:forEach var="dept" items="${departements}">
									<option>${ dept.nom }</option>
								</c:forEach>
							</select>
						</div>
					</div>
				</div>
				<div class="col-sm-6">
					<div class="row">
						<div class="col-sm-6">
							<button type="submit" class="btn btn-default">Rechercher</button>
						</div>
						<div class="col-sm-6">
							<div class="checkbox">
								<label><input type="checkbox"><b>Voir les collaborateurs désactivés</b></label>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<br><br>
		
		<div class="row">
			<c:forEach var="collab" items="${collaborateurs}">
				<div class=" col-sm-4">
					<div class="panel panel-default">
						<!-- Default panel contents -->
						<div class="panel-heading">${collab.nom} ${collab.prenom}</div>
						<div class="panel-body">
							<img class="card-img-top" width="200" height="200"
								src="${collab.photo}">
							<p>${collab}</p>
						</div>
					</div>
				</div>

			</c:forEach>
		</div>

	</div>

</body>
</html>