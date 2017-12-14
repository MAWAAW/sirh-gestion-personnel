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
		listeCollaborateurs.add(new Collaborateur("nom1", "prenom1", 
				LocalDate.parse("1991-12-12", DateTimeFormatter.ofPattern("yyyy-MM-dd")),
				"41 rue du lynx", "123456789012345"));
		listeCollaborateurs.add(new Collaborateur("nom2", "prenom2", 
				LocalDate.parse("1991-12-12", DateTimeFormatter.ofPattern("yyyy-MM-dd")),
				"41 rue du lynx", "123456789012345"));
		listeCollaborateurs.add(new Collaborateur("nom3", "prenom3", 
				LocalDate.parse("1991-12-12", DateTimeFormatter.ofPattern("yyyy-MM-dd")),
				"41 rue du lynx", "123456789012345"));
		listeCollaborateurs.add(new Collaborateur("nom4", "prenom4", 
				LocalDate.parse("1991-12-12", DateTimeFormatter.ofPattern("yyyy-MM-dd")),
				"41 rue du lynx", "123456789012345"));
		listeCollaborateurs.add(new Collaborateur("nom5", "prenom5", 
				LocalDate.parse("1991-12-12", DateTimeFormatter.ofPattern("yyyy-MM-dd")),
				"41 rue du lynx", "123456789012345"));
	}
	
	public List<Collaborateur> listerCollaborateurs() {
		return listeCollaborateurs;
	}
	
	public void sauvegarderCollaborateur(Collaborateur collaborateur) {
		listeCollaborateurs.add(collaborateur);
	}
	
}
