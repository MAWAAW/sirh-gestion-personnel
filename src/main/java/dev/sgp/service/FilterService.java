package dev.sgp.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dev.sgp.entite.Departement;

public class FilterService {

	Map<String,List<Integer>> listeFiltres = new HashMap<>();
	
	public FilterService() {
		
	}
	
	public Map<String,List<Integer>> listerFiltres() {
		return listeFiltres;
	}
	
}
