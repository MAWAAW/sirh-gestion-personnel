package dev.sgp.ecouteur;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;
import dev.sgp.util.Constantes;

@WebListener
public class Initializer implements ServletContextListener {
	
	private final CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	private final DepartementService departementService = Constantes.DEPARTEMENT_SERVICE;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		collabService.sauvegarderCollaborateur(new Collaborateur("Barrault", "Loic", LocalDate.parse("1982-01-24", DateTimeFormatter.ofPattern("yyyy-MM-dd")), "41 rue du lynx", "123456789012345"));
		collabService.sauvegarderCollaborateur(new Collaborateur("La sauvage", "Marie", LocalDate.parse("1952-10-24", DateTimeFormatter.ofPattern("yyyy-MM-dd")), "24 rue du loup", "754215485412457"));
		collabService.sauvegarderCollaborateur(new Collaborateur("Haddock", "Capitaine", LocalDate.parse("1927-12-21", DateTimeFormatter.ofPattern("yyyy-MM-dd")), "10 rue du lion", "745283695623658"));
		collabService.sauvegarderCollaborateur(new Collaborateur("Leponge", "Bob", LocalDate.parse("1967-12-05", DateTimeFormatter.ofPattern("yyyy-MM-dd")), "27 rue du tigre", "542525856985854"));
		collabService.sauvegarderCollaborateur(new Collaborateur("Picasso", "Pablo", LocalDate.parse("1967-10-27", DateTimeFormatter.ofPattern("yyyy-MM-dd")), "4 rue du singe", "145855545365585"));
		collabService.sauvegarderCollaborateur(new Collaborateur("Jaegger", "Mike", LocalDate.parse("1934-08-14", DateTimeFormatter.ofPattern("yyyy-MM-dd")), "14 rue du bol", "454588583639871"));
		collabService.sauvegarderCollaborateur(new Collaborateur("Le Marchale", "Gregory", LocalDate.parse("1974-01-10", DateTimeFormatter.ofPattern("yyyy-MM-dd")), "25 rue du louvre", "142536987585247"));
		collabService.sauvegarderCollaborateur(new Collaborateur("Francois", "Claude", LocalDate.parse("1987-05-11", DateTimeFormatter.ofPattern("yyyy-MM-dd")), "7 rue des fous", "174582396285394"));
		departementService.sauvegarderDepartement(new Departement(1, "Comptabilité"));
		departementService.sauvegarderDepartement(new Departement(2, "Ressources Humaines"));
		departementService.sauvegarderDepartement(new Departement(3, "Informatique"));
		departementService.sauvegarderDepartement(new Departement(4, "Administratif"));
	
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
	}
}
