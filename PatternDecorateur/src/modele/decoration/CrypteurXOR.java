package modele.decoration;

import modele.Message;

public class CrypteurXOR extends Message {
	protected Message message;
	protected String cryptage;
	
	public CrypteurXOR(Message message) {
		super();
		this.message = message;
		this.crypter();
	}

	public String getAuteur() {
		return this.message.getAuteur();
	}

	public void setAuteur(String auteur) {
		this.message.setAuteur(auteur);
	}

	public String getTexte() {
		return cryptage;
	}

	public void setTexte(String texte) {
		this.message.setTexte(texte);
		this.cryptage = texte;
	}
	
	public void crypter() {
		byte[] octets = message.getTexte().getBytes();
		byte[] nouvelles = new byte[octets.length];
		
		for(int position = 0; position < octets.length; position++) {
			byte octet = octets[position];
			byte nouveau = (byte)(octet ^ 'X');
			nouvelles[position] = nouveau;
		}
		this.cryptage = new String(nouvelles);
	}
}