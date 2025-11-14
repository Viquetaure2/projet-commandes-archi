package controleur.commande;

import modele.COULEURS;
import modele.Carte;
import modele.TuileCarte;
import modele.TuileCarte.TUILES;
import vue.VueBattlemaps;

public class CommandePlacerTuile extends Commande{
	protected TUILES tuileChoisie;
	protected int posX;
	protected int posY;
	protected COULEURS couleurChoisie;
	protected Carte carte;
	protected TuileCarte nouvelleTuile;
	
	public CommandePlacerTuile(TUILES tuileChoisie, COULEURS couleurChoisie, int posX, int posY, Carte carte) {
		this.posX = posX;
		this.posY = posY;
		this.tuileChoisie = tuileChoisie;
		this.couleurChoisie = couleurChoisie;
		this.carte = carte;
	}

	@Override
	public void executer() {
		this.nouvelleTuile = new TuileCarte(this.tuileChoisie);
		this.carte.getTuilesCarte().add(nouvelleTuile);
		VueBattlemaps.getInstance().placerTuile(tuileChoisie, couleurChoisie, posX, posY);
	}
	
	@Override
	public void annuler() {
		VueBattlemaps.getInstance().retirerTuile(this.tuileChoisie, posX, posY);
	}
}
