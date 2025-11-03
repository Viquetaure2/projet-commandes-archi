package controleur.commande;

import modele.THEME;
import vue.VueBattlemaps;

public class CommandeChoisirTerrain extends Commande{
	protected THEME theme;
	
	public CommandeChoisirTerrain(THEME theme) {
		this.theme = theme;
	}

	@Override
	public void executer() {
		VueBattlemaps.getInstance().changerTheme(theme);
	}

}
