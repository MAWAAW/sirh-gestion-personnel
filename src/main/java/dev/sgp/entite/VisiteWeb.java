package dev.sgp.entite;

public class VisiteWeb {
	
	private String chemin;
	
	private Integer tempsExecution;

	public VisiteWeb(String chemin, Integer tempsExecution) {
		this.chemin = chemin;
		this.tempsExecution = tempsExecution;
	}

	@Override
	public String toString() {
		return "VisiteWeb [chemin=" + chemin + ", tempsExecution=" + tempsExecution + "]";
	}

	public String getChemin() {
		return chemin;
	}

	public void setChemin(String chemin) {
		this.chemin = chemin;
	}

	public Integer getTempsExecution() {
		return tempsExecution;
	}

	public void setTempsExecution(Integer tempsExecution) {
		this.tempsExecution = tempsExecution;
	}
	
	
	
}
