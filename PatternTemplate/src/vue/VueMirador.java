package vue;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import javafx.scene.control.TextArea;
import modele.Nouvelle;
import architecture.Vue;
import controleur.ControleurMirador;
public class VueMirador extends Vue {

	protected ControleurMirador controleur;
	protected static VueMirador instance = null; 
	public static VueMirador getInstance() {if(null==instance)instance = new VueMirador();return VueMirador.instance;}; 
	
	private VueMirador() 
	{
		super("mirador.fxml", VueMirador.class);
		super.controleur = this.controleur = new ControleurMirador();
		Logger.logMsg(Logger.INFO, "new VueMirador()");
	}
		
	public void activerControles()
	{
		super.activerControles();
	}
	
	public void afficherNouvelle(Nouvelle nouvelle)
	{
		TextArea vueNouvelles = (TextArea)lookup("#nouvelles-spacex");
		vueNouvelles.setText(nouvelle.getTitre());
	}
	
	public void afficherNouvelles(List<Nouvelle> nouvelles)
	{
		TextArea vueNouvelles = (TextArea)lookup("#nouvelles-spacex");
		for(Nouvelle nouvelle:nouvelles) {
			vueNouvelles.appendText(nouvelle.getTitre() + "\n");
		}
	}
}
