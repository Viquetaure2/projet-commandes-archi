package vue;
import java.util.Hashtable;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurTableauHonneur;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;

public class VueTableauHonneur extends Vue {

	protected ControleurTableauHonneur controleur;
	protected static VueTableauHonneur instance = null; 
	public static VueTableauHonneur getInstance() {if(null==instance)instance = new VueTableauHonneur();return VueTableauHonneur.instance;}; 
	
	private VueTableauHonneur() 
	{
		super("honneur.fxml", VueTableauHonneur.class, 1294,743);
		super.controleur = this.controleur = new ControleurTableauHonneur();
		Logger.logMsg(Logger.INFO, "new VueTableauHonneur()");
	}
		
	public void activerControles()
	{
		super.activerControles();
		BadgeRacinette BadgeRacinette = new BadgeRacinette().ALaRacinetteBrune();
		
		AnchorPane espaceTravail = (AnchorPane)lookup("#espace-travail");
		espaceTravail.getChildren().add(BadgeRacinette);
	}	
}






