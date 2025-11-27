package vue;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurJeuxCarte;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import modele.JeuCarte;

public class VueJeuxCarte extends Vue {
	
	protected ControleurJeuxCarte controleur;
	
	protected static VueJeuxCarte instance = null; 
	public static VueJeuxCarte getInstance()  { if(null==instance) instance = new VueJeuxCarte(); return VueJeuxCarte.instance;}; 
	
	private VueJeuxCarte()  {
		super("jeuxcartes.fxml", VueJeuxCarte.class);
		Logger.logMsg(Logger.INFO, "new VueJeuxCarte()");
		super.controleur = this.controleur = new ControleurJeuxCarte();
	}

	public void afficherJeuCarte(JeuCarte jeuCarte) {
		Label vueSuccess = (Label)lookup("#success");
		if (jeuCarte.isSuccess() == true) {
			vueSuccess.setText("Oui!");
		} else {
			vueSuccess.setText("Non");
		}
		
		Label vueDeckId = (Label)lookup("#deck-id");
		vueDeckId.setText(jeuCarte.getDeck_id());
		
		Label vueRemaining = (Label)lookup("#remaining");
		vueRemaining.setText(String.valueOf(jeuCarte.getRemaining()));
		
		Label vueShuffled = (Label)lookup("#shuffled");
		if (jeuCarte.isShuffled() == true) {
			vueShuffled.setText("Oui");
		} else {
			vueShuffled.setText("Non");
		}
	}
}
