package modele;

public class JeuCarte {
	protected int id;
	protected boolean success;
	protected String deck_id;
	protected int remaining;
	protected boolean shuffled;
	
	public JeuCarte(int id, boolean success, String deck_id, int remaining, boolean shuffled) {
		super();
		this.id = id;
		this.success = success;
		this.deck_id = deck_id;
		this.remaining = remaining;
		this.shuffled = shuffled;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getDeck_id() {
		return deck_id;
	}
	public void setDeck_id(String deck_id) {
		this.deck_id = deck_id;
	}
	public int getRemaining() {
		return remaining;
	}
	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}
	public boolean isShuffled() {
		return shuffled;
	}
	public void setShuffled(boolean shuffled) {
		this.shuffled = shuffled;
	}
}
