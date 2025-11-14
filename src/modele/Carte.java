package modele;

import java.util.ArrayList;
import java.util.List;

public class Carte {
	protected List<TuileCarte> tuiles = new ArrayList<TuileCarte>();
	protected ThemeCarte theme = new ThemeCarte(ThemeCarte.THEME.DEFAULT);
	
	public Carte() {
		
	}
	
	public void poserTuile(TuileCarte tuile) {
		this.tuiles.add(tuile);
	}
	
	public List<TuileCarte> getTuilesCarte() {
		return tuiles;
	}
	
	public ThemeCarte getThemeCarte() {
		return theme;
	}
	
	public void setThemeCarte(ThemeCarte theme) {
		this.theme = theme;
	}
}
