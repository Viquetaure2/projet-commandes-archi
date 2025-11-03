package controleur;

import java.util.Stack;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import controleur.commande.Commande;
import controleur.commande.CommandeChoisirTerrain;
import controleur.commande.CommandePlacerMaison;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import modele.COULEURS;
import modele.THEME;
import modele.TUILES;
import vue.VueBattlemaps;

public class ControleurBattlemaps extends Controleur{

	public ControleurBattlemaps()
	{
		Logger.logMsg(Logger.INFO, "new ControleurJardinator()");
	}
	
	public void initialiser()
	{
		
	}
	
	TUILES tuileChoisi = null;
	COULEURS couleurChoisie = COULEURS.JAUNE;

	public void notifierClicTitre(Text actionEditTitre) {
		TextField textField = new TextField(actionEditTitre.getText());
		textField.setLayoutX(actionEditTitre.getLayoutX());
        textField.setLayoutY(actionEditTitre.getLayoutY()-50);
        textField.setFont(actionEditTitre.getFont());
        textField.setPrefWidth(actionEditTitre.getLayoutBounds().getWidth());
        
        ((Pane) actionEditTitre.getParent()).getChildren().add(textField);
        actionEditTitre.setVisible(false);
        
        textField.requestFocus();
        textField.selectAll();
        
        textField.setOnAction(e -> {
        	actionEditTitre.setText(textField.getText());
        	actionEditTitre.setVisible(true);
        	((Pane) actionEditTitre.getParent()).getChildren().remove(textField);
        });
	}

	public void notifierClicTuile(TUILES tuile) {
		this.tuileChoisi = tuile;
	}

	public void notifierClicCarte(int posX, int posY) {
		Commande commande = new CommandePlacerMaison(this.tuileChoisi, this.couleurChoisie, posX, posY);
		commande.executer();
		
	}
	
	public void notifierClicCouleur(COULEURS couleur) {
		this.couleurChoisie = couleur;
	}

	Stack<Commande> historique = new Stack<Commande>();
	
	public void notifierClicTheme(THEME theme) {
		Commande commande = new CommandeChoisirTerrain(theme);
		commande.executer();
		
	}
}