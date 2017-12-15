package dev.sgp.web;

import static java.util.stream.Collectors.*;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;
import dev.sgp.service.FilterService;
import dev.sgp.util.Constantes;

@WebServlet("/collaborateurs/statistiques")
public class FrequentationFilterController extends HttpServlet {
	
	private final FilterService filterService = Constantes.FILTER_SERVICE;

	@Override
	public void doGet(HttpServletRequest request, 
			HttpServletResponse resp) throws ServletException, IOException {
		

		Map<String, IntSummaryStatistics> result = filterService.listerFiltres().stream().collect(
				groupingBy(v -> v.getChemin(), summarizingInt(VisiteWeb::getTempsExecution)));
		
		request.setAttribute("visites", result);
		
		request.getRequestDispatcher("/WEB-INF/views/collab/statistiques.jsp")
			.forward(request,resp);
		
	}
	
}
