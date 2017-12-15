package dev.sgp.util;

import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;
import dev.sgp.service.FilterService;

public interface Constantes {

	CollaborateurService COLLAB_SERVICE = new CollaborateurService();
	
	DepartementService DEPARTEMENT_SERVICE = new DepartementService();
	
	FilterService FILTER_SERVICE = new FilterService();

}
