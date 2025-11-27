package modele;

public class TuileCarte {
	public enum TUILES {CHEMIN, CHEMIN_VIRAGE, RIVIERE, TRESOR, FORET, ROCHES, MAISON, TOUR, DEFAULT}
	
	protected TUILES tuile;
	protected int x;
	protected int y;
	
	public TuileCarte(TUILES tuile) {
		super();
		this.tuile = tuile;
	}
	
	public TuileCarte(TUILES tuile, int x, int y) {
		super();
		this.tuile = tuile;
		this.x = x;
		this.y = y;
	}

	public TUILES getTuile() {
		return tuile;
	}

	public void setTuile(TUILES tuile) {
		this.tuile = tuile;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x =x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

}