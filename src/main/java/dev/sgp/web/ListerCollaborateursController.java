package dev.sgp.web;

import java.util.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.invoke.ConstantCallSite;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class ListerCollaborateursController extends HttpServlet {
	
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override
	public void doGet(HttpServletRequest request, 
			HttpServletResponse resp) throws ServletException, IOException {

		List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
		request.setAttribute("collaborateurs", collaborateurs);
		
		request.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp")
			.forward(request,resp);
		
	}
	
}
