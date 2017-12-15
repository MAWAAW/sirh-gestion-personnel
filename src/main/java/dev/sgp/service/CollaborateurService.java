package dev.sgp.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;

public class CollaborateurService {

	List<Collaborateur> listeCollaborateurs = new ArrayList<>();
	
	public CollaborateurService() {
		
	}
	
	public List<Collaborateur> listerCollaborateurs() {
		return listeCollaborateurs;
	}
	
	public void sauvegarderCollaborateur(Collaborateur collaborateur) {
		listeCollaborateurs.add(collaborateur);
	}
	
}
