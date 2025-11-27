package modele;

public class Nouvelle {
	protected String titre;
	protected String auteur;
	protected String resume;
	protected String date;
	
	public Nouvelle(String titre, String auteur, String resume, String date) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.resume = resume;
		this.date = date;
	}
	
	public Nouvelle(String titre) {
		super();
		this.titre = titre;
	}

	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
