package modele;

public class ThemeCarte {

	public enum THEME {PLAINE, NEIGE, DESERT, DEFAULT}
	protected THEME theme;
	
	public ThemeCarte(THEME theme) {
		super();
		this.theme = theme;
	}

	public THEME getTheme() {
		return theme;
	}

	public void setTheme(THEME theme) {
		this.theme = theme;
	}
}
