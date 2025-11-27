package vue;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurFaitsAleatoires;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import modele.FaitAleatoire;

public class VueFaitsAleatoires extends Vue {
	
	protected ControleurFaitsAleatoires controleur;
	
	protected static VueFaitsAleatoires instance = null; 
	public static VueFaitsAleatoires getInstance()  { if(null==instance) instance = new VueFaitsAleatoires(); return VueFaitsAleatoires.instance;}; 
	
	private VueFaitsAleatoires()  {
		super("faitsaleatoires.fxml", VueFaitsAleatoires.class);
		Logger.logMsg(Logger.INFO, "new VueFaitsAleatoires()");
		super.controleur = this.controleur = new ControleurFaitsAleatoires();
	}

	public void afficherFaitAleatoire(FaitAleatoire faitAleatoire) {
		TextArea vueText = (TextArea)lookup("#text");
		vueText.setText(faitAleatoire.getText());
		
		Label vueSource = (Label)lookup("#source");
		vueSource.setText(faitAleatoire.getSource());
		
		Label vueUrl = (Label)lookup("#source-url");
		vueUrl.setText(faitAleatoire.getSource_url());
		
		Label vueLanguage = (Label)lookup("#language");
		vueLanguage.setText(faitAleatoire.getLanguage());
		
		Label vuePermalink = (Label)lookup("#permalink");
		vuePermalink.setText(faitAleatoire.getPermalink());
	}
}
