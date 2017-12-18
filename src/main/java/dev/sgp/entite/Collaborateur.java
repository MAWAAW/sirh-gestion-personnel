package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.UUID;

public class Collaborateur {
	
	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private String adresse;
	private String numeroSecuriteSociale;
	private String emailPro;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	private Boolean actif;
	private String intitulePoste;
	private Departement departement;
	
	public Collaborateur(String nom, String prenom, LocalDate dateNaissance, String adresse,
			String numeroSecuriteSociale) {
		this.matricule = UUID.randomUUID().toString();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.adresse = adresse;
		this.numeroSecuriteSociale = numeroSecuriteSociale; // doit contenir 15 chiffres
		this.emailPro = this.nom+"."+this.prenom+"@dta.com"; // genere un email pro prenom.nom@societe.com
		this.photo = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/Creative-Tail-People-man-2.svg/1024px-Creative-Tail-People-man-2.svg.png";
		this.dateHeureCreation = ZonedDateTime.now();
		this.actif = true;
		this.intitulePoste = "esclave";
	}
	
	@Override
	public String toString() {
		return "Matricule= " + matricule + "\n, Date de naissance= " + dateNaissance + "\n, Adresse= "
				+ adresse + "\n, Poste= " + intitulePoste + "\n, Departement= " + departement;
	}

	public String getNumeroSecuriteSociale() {
		return numeroSecuriteSociale;
	}

	public void setNumeroSecuriteSociale(String numeroSecuriteSociale) {
		this.numeroSecuriteSociale = numeroSecuriteSociale;
	}

	public String getIntitulePoste() {
		return intitulePoste;
	}

	public void setIntitulePoste(String intitulePoste) {
		this.intitulePoste = intitulePoste;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public Boolean getActif() {
		return actif;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumSecuriteSociale() {
		return numeroSecuriteSociale;
	}

	public void setNumSecuriteSociale(String numeroSecuriteSociale) {
		this.numeroSecuriteSociale = numeroSecuriteSociale;
	}

	public String getEmailPro() {
		return emailPro;
	}

	public void setEmailPro(String emailPro) {
		this.emailPro = emailPro;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

	public Boolean isActif() {
		return actif;
	}

	public void setActif(Boolean actif) {
		this.actif = actif;
	}
}
