package dev.sgp.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, 
			HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		
	}
	
	@Override
	public void doPost(HttpServletRequest request, 
			HttpServletResponse resp) throws ServletException, IOException {
		
		String matricule = request.getParameter("matricule");
		String titre = request.getParameter("titre");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String dateDeNaissance = request.getParameter("dateDeNaissance");
		String adresse = request.getParameter("adresse");
		String numeroSecuriteSociale = request.getParameter("numeroSecuriteSociale");
		
		resp.setContentType("text/html");
		resp.sendRedirect(request.getContextPath()+"/collaborateurs/lister");;	
			
			
	}
	
}
