package controleur.commande;

import modele.Carte;
import modele.ThemeCarte;
import vue.VueBattlemaps;

public class CommandeChoisirTerrain extends Commande{
	
	protected Carte carte;
	protected ThemeCarte.THEME theme;
	protected ThemeCarte.THEME ancientTheme;
	
	public CommandeChoisirTerrain(ThemeCarte.THEME theme, Carte carte) {
		this.carte = carte;
		this.theme = theme;
	}

	@Override
	public void executer() {
		this.ancientTheme = this.carte.getThemeCarte().getTheme();
		this.carte.setThemeCarte(new ThemeCarte(theme));
		VueBattlemaps.getInstance().changerTheme(theme);
	}
	
	public void annuler() {
		VueBattlemaps.getInstance().changerTheme(ancientTheme);
		this.carte.setThemeCarte(new ThemeCarte(ancientTheme));
	}
}
