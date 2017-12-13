package dev.sgp.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListerCollaborateursController extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, 
			HttpServletResponse resp) throws ServletException, IOException {
		
		// recupere la valeur d'un parametre dont le nom est avecPhoto
		String avecPhotoParam = request.getParameter("avecPhoto");
		// recupere la valeur d'un parametre dont le nom est departement
		String departementParam = request.getParameter("departement");
		resp.setContentType("text/html");
		// code HTML ecrit dans le corps de la reponse
		resp.getWriter().write("<h1>Liste des collaborateurs</h1>"
		+ "<ul>"
		+ "<li>avecPhoto="+ avecPhotoParam + "</li>"
		+ "<li>departement="+ departementParam + "</li>"
		+ "</ul>");
	}
	
}
