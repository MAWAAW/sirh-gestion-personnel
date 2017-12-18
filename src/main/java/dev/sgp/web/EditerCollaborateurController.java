package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;
import dev.sgp.util.Constantes;

@WebServlet("/collaborateurs/editer")
public class EditerCollaborateurController extends HttpServlet {
	
	private final CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override
	public void doGet(HttpServletRequest request, 
			HttpServletResponse resp) throws ServletException, IOException {
		
		String matricule = request.getParameter("matricule");
		
		Collaborateur collab = collabService.listerCollaborateurs().stream().filter(c -> c.getMatricule().equals(matricule)).findAny().orElse(null);
		
		request.setAttribute("collab", collab);
		request.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateur.jsp")
			.forward(request,resp);
		
	}
	
	@Override
	public void doPost(HttpServletRequest request, 
			HttpServletResponse resp) throws ServletException, IOException {
	
		String matricule = request.getParameter("matricule");
		String adresse = request.getParameter("adresse");
		
		Collaborateur collab = collabService.listerCollaborateurs().stream().filter(c -> c.getMatricule().equals(matricule)).findFirst().orElse(null);
		collab.setAdresse(adresse);
		
		resp.setContentType("text/html");
		resp.sendRedirect(request.getContextPath()+"/collaborateurs/lister");;	
				
	}
	
}
