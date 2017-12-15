package dev.sgp.service;

import java.util.List;
import java.util.ArrayList;

import dev.sgp.entite.Departement;
import dev.sgp.entite.VisiteWeb;

public class FilterService {

	List<VisiteWeb> listeFiltres = new ArrayList<>();
	
	public FilterService() {
		
	}
	
	public List<VisiteWeb> listerFiltres() {
		return listeFiltres;
	}
	
	public void sauvegarderVisiteWeb(VisiteWeb visiteWeb) {
		listeFiltres.add(visiteWeb);
	}
	
}
