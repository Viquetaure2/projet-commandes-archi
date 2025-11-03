package controleur.commande;

import modele.COULEURS;
import modele.TUILES;
import vue.VueBattlemaps;

public class CommandePlacerMaison extends Commande{
	protected TUILES tuileChoisie;
	protected int posX;
	protected int posY;
	protected COULEURS couleurChoisie;
	
	public CommandePlacerMaison(TUILES tuileChoisie, COULEURS couleurChoisie, int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
		this.tuileChoisie = tuileChoisie;
		this.couleurChoisie = couleurChoisie;
	}

	@Override
	public void executer() {
		VueBattlemaps.getInstance().placerTuile(tuileChoisie, couleurChoisie, posX, posY);
	}
	
}
