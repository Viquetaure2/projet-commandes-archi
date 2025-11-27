package vue;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurCometes;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import modele.Comete;

public class VueCometes extends Vue {
	
	protected ControleurCometes controleur;
	
	protected static VueCometes instance = null; 
	public static VueCometes getInstance()  { if(null==instance) instance = new VueCometes(); return VueCometes.instance;}; 
	
	private VueCometes()  {
		super("cometes.fxml", VueCometes.class);
		Logger.logMsg(Logger.INFO, "new VueCometes()");
		super.controleur = this.controleur = new ControleurCometes();
	}

	public void afficherComete(Comete comete) {

			Label vueNom = (Label)lookup("#nom");
			vueNom.setText(comete.getName());
			
			Label vueType = (Label)lookup("#type");
			vueType.setText("Type: " + comete.getType());
			
			Label vueComponent = (Label)lookup("#component");
			vueComponent.setText("Principalement composé de : " + comete.getComponent());
			
			Label vueMag = (Label)lookup("#mag");
			vueMag.setText("Magnitude actuelle de : " + comete.getCurrent_mag());
	}
}
