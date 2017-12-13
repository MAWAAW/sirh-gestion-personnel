package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class EditerCollaborateurController extends HttpServlet {
	
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override
	public void doGet(HttpServletRequest request, 
			HttpServletResponse resp) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateur.jsp")
			.forward(request,resp);
		
	}
	
	@Override
	public void doPost(HttpServletRequest request, 
			HttpServletResponse resp) throws ServletException, IOException {
		
	
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String dateNaissance = request.getParameter("dateNaissance");
		String adresse = request.getParameter("adresse");
		String numeroSecuriteSociale = request.getParameter("numeroSecuriteSociale");
		
		collabService.sauvegarderCollaborateur(new Collaborateur(nom, prenom, 
				LocalDate.parse(dateNaissance, DateTimeFormatter.ofPattern("yyyy-MM-dd")),
						adresse, numeroSecuriteSociale));
		
		resp.setContentType("text/html");
		resp.sendRedirect(request.getContextPath()+"/collaborateurs/lister");;	
			
			
	}
	
}
