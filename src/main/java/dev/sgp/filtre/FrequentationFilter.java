package dev.sgp.filtre;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

//Se lance dès le début de l'application
public class FrequentationFilter implements Filter {

	private FilterConfig config = null;
	
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
		config.getServletContext().log(path + " : " + (after - before));
	}
	
	public void destroy() {
	}
}
