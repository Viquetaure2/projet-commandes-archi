package modele.decoration;

import modele.Message;

public class Chiffreur extends Message {
	protected Message message;
	protected String chiffrage;
	
	public Chiffreur(Message message) {
		super();
		this.message = message;
		this.chiffrer();
	}

	public String getAuteur() {
		return this.message.getAuteur();
	}

	public void setAuteur(String auteur) {
		this.message.setAuteur(auteur);
	}

	public String getTexte() {
		return chiffrage;
	}

	public void setTexte(String texte) {
		this.message.setTexte(texte);
		this.chiffrage = texte;
	}
	
	public void chiffrer() {	
		byte[] octets = message.getTexte().getBytes();
		String nouveaux = "";
		
		for(int position = 0; position < octets.length; position++) {
			byte octet = octets[position];
			System.out.println("Octet : " + octet);
			
			String nouveau = Integer.toBinaryString(octet);
			System.out.println("Nouveau : " + nouveau);
			nouveaux += nouveau;
		}
		
		this.chiffrage = new String(nouveaux);
	}
}