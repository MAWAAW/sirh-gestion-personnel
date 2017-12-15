package dev.sgp.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;

public class DepartementService {

	List<Departement> listeDepartements = new ArrayList<>();
	
	public DepartementService() {

	}
	
	public List<Departement> listerDepartements() {
		return listeDepartements;
	}
	
	public void sauvegarderDepartement(Departement departement) {
		listeDepartements.add(departement);
	}
}
