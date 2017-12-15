package dev.sgp.filtre;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;
import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.FilterService;
import dev.sgp.util.Constantes;

//Se lance dès le début de l'application
@WebFilter("/*")
public class FrequentationFilter implements Filter {

	private FilterConfig config = null;
	
	private FilterService filterService = Constantes.FILTER_SERVICE;
	
	public void init(FilterConfig config) throws ServletException {
		this.config = config;
		config.getServletContext().log("FrequentationFilter initialized");
	}
	
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
									throws IOException, ServletException {
		
		long before = System.currentTimeMillis();
		chain.doFilter(req, resp);
		long after = System.currentTimeMillis();
		String path = ((HttpServletRequest) req).getRequestURI();
		
		VisiteWeb visiteWeb = new VisiteWeb(path, (Integer.parseInt((after-before)+"")));
		filterService.sauvegarderVisiteWeb(visiteWeb);
	}
	
	public void destroy() {
	}
}
