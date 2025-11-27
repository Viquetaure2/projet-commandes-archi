package modele.decoration;

import modele.Message;

public class AtbashCipher extends Message {
	protected Message message;
	protected String cryptage;
	
	public AtbashCipher(Message message) {
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
		char[] lettres = message.getTexte().toCharArray();
		char[] nouvelles = new char[lettres.length];
		
		for (int position = 0; position < lettres.length; position++) {
			char lettre = lettres[position];
			System.out.println("Lettre : " + lettre);
			
			if (lettre >= 'a' && lettre <= 'z') {
				char lettreEncode = (char) ('z'-(lettre-'a'));
				System.out.println("Nouvelle : " + lettreEncode);
				nouvelles[position] = lettreEncode;
			}
			else {
				nouvelles[position] = lettre;
			}
		}
		this.cryptage = new String(nouvelles);
	}
}