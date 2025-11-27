package modele;

public class Message {
	
	protected String auteur;
	protected String texte;
	
	public Message() {
		super();
		this.auteur = "";
		this.texte = "";
	}
	
	public Message(String auteur, String texte) {
		super();
		this.auteur = auteur;
		this.texte = texte;
	}
	
	public Message(String texte) {
		super();
		this.texte = texte;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
	}
}
