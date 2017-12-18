package dev.sgp.web;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.invoke.ConstantCallSite;
import java.util.Arrays;

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

@WebServlet("/collaborateurs/lister")
public class ListerCollaborateursController extends HttpServlet {
	
	private final CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	
	private final DepartementService departementService = Constantes.DEPARTEMENT_SERVICE;

	@Override
	public void doGet(HttpServletRequest request, 
			HttpServletResponse resp) throws ServletException, IOException {

		List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
		request.setAttribute("collaborateurs", collaborateurs);
		
		List<Departement> departements = departementService.listerDepartements();
		request.setAttribute("departements", departements);
		
		request.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp")
			.forward(request,resp);
		
	}
	
	@Override
	public void doPost(HttpServletRequest request, 
			HttpServletResponse resp) throws ServletException, IOException {
		
		request.getRequestDispatcher("/WEB-INF/views/collab/editerCollaborateurs.jsp")
			.forward(request,resp);
		
	}
	
}
