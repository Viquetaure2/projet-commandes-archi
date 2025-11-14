package controleur;

import java.util.Stack;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import controleur.commande.Commande;
import controleur.commande.CommandeChoisirTerrain;
import controleur.commande.CommandePlacerTuile;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import modele.COULEURS;
import modele.Carte;
import modele.ThemeCarte;
import modele.TuileCarte;
import vue.VueBattlemaps;

public class ControleurBattlemaps extends Controleur{

	public ControleurBattlemaps()
	{
		Logger.logMsg(Logger.INFO, "new ControleurJardinator()");
	}
	
	public void initialiser()
	{
		
	}
	
	protected TuileCarte.TUILES tuileChoisie = null;
	protected Carte carte = new Carte();
	COULEURS couleurChoisie = COULEURS.JAUNE;
	Stack<Commande> historique = new Stack<Commande>();
	Stack<Commande> annulations = new Stack<Commande>();

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

	public void notifierClicTuile(TuileCarte.TUILES tuile) {
		this.tuileChoisie = tuile;
	}

	public void notifierClicCarte(int posX, int posY) {
		Commande commande = new CommandePlacerTuile(this.tuileChoisie, this.couleurChoisie, posX, posY, carte);
		commande.executer();
		historique.add(commande);
		
	}
	
	public void notifierClicCouleur(COULEURS couleur) {
		this.couleurChoisie = couleur;
	}
	
	public void notifierClicTheme(ThemeCarte.THEME theme) {
		Commande commande = new CommandeChoisirTerrain(theme, carte);
		commande.executer();
		historique.add(commande);
	}

	public void notifierActionUndo() {
		if(!historique.isEmpty()) {
			Commande commande = historique.pop();
			commande.annuler();
			annulations.add(commande);
		}
	}
	
	public void notifierActionRedo() {
		if (!annulations.isEmpty()) {
			Commande commande = annulations.pop();
			commande.executer();
			historique.add(commande);
		}
	}
}