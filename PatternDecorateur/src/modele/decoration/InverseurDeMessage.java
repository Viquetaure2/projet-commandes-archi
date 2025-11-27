package modele.decoration;

import modele.Message;

public class InverseurDeMessage extends Message {
	protected Message message;
	protected String inversion;
	
	public InverseurDeMessage(Message message) {
		super();
		this.message = message;
		this.inverser();
	}

	public String getAuteur() {
		return this.message.getAuteur();
	}

	public void setAuteur(String auteur) {
		this.message.setAuteur(auteur);
	}

	public String getTexte() {
		return inversion;
	}

	public void setTexte(String texte) {
		this.message.setTexte(texte);
		this.inversion = texte;
	}
	
	public void inverser() {
		StringBuffer messageModifiable = new StringBuffer(this.message.getTexte());
		this.inversion = messageModifiable.reverse().toString();
	}
}
