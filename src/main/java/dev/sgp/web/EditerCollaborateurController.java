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
		
		String matricule = request.getParameter("matricule");	
		resp.setContentType("text/html");
		resp.getWriter().write("<h1>Edition de collaborateur</h1>"+"Matricule:"+ matricule);	
	}
	
	@Override
	public void doPost(HttpServletRequest request, 
			HttpServletResponse resp) throws ServletException, IOException {
		
		String matricule = request.getParameter("matricule");
		String titre = request.getParameter("titre");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		
		resp.setContentType("text/html");
		
		if(matricule == null || titre == null || nom == null || prenom == null) {
			resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			resp.getWriter().write("Au moins l'un des parametres suivants est incorrect: "
				+ matricule +", "
				+ titre +", "
				+ nom +", "
				+ prenom
			);
		}
		else {
			resp.getWriter().write("<h1>Creation d'un collaborateur avec les informations suivantes</h1>"
				+"matricule: "+ matricule +", "
				+"titre: "+ titre +", "
				+"nom: "+ nom +", "
				+"prenom: "+ prenom
			);
		}
			
			
	}
	
}
