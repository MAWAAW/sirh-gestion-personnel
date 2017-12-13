package dev.sgp.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListerCollaborateursController extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, 
			HttpServletResponse resp) throws ServletException, IOException {

		request.setAttribute("listeNoms", Arrays.asList("Julien","Alice","Mehdi"));
		
		request.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp")
			.forward(request,resp);
		
	}
	
}
