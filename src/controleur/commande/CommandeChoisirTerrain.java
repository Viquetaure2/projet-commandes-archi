package controleur.commande;

import modele.THEME;
import vue.VueBattlemaps;

public class CommandeChoisirTerrain extends Commande{
	
	protected Carte carte;
	protected THEME theme;
	protected THEME ancientTheme;
	
	public CommandeChoisirTerrain(THEME theme) {
		this.theme = theme;
	}

	@Override
	public void executer() {
		VueBattlemaps.getInstance().changerTheme(theme);
	}
	
	public void annuler() {
		VueBattlemaps.getInstance().afficherTheme(ancientTheme);
	}

}
