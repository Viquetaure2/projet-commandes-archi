package vue;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class BadgeRacinette extends AnchorPane{
	public enum COULEUR{ROUGE, BLEU, JAUNE, NOIR};

	public BadgeRacinette() {
		//AnchorPane this = new AnchorPane();
		this.setPrefHeight(200);
		this.setPrefWidth(166);
		this.setStyle("-fx-background-color:blue");
		
		ImageView ecusson = new ImageView();
		ecusson.setImage(new Image("vue/badge/armoirie.png"));
		this.getChildren().add(ecusson);
		
		this.setVagues();
		this.getChildren().add(dragon);
		
		this.setRacinetteDeux();
		this.getChildren().add(racinetteDeux);
		
		this.setRacinetteUn();
		this.getChildren().add(racinetteUn);
		
		Label motto = new Label();
		motto.setText("RACINETTE!!");
		motto.setStyle("-fx-font:25px Tahoma; -fx-font-weight-bold;");
		motto.setLayoutX(80);
		motto.setLayoutY(50);
		this.getChildren().add(motto);
	}
	
	protected ImageView racinetteUn = new ImageView();
	public void setRacinetteUn() {
		racinetteUn.setImage(new Image("vue/badge/racinette.png"));
		racinetteUn.setScaleX(-0.5);
		racinetteUn.setScaleY(0.5);
		racinetteUn.setLayoutX(175);
		racinetteUn.setLayoutY(50);
	}
	
	protected ImageView racinetteDeux = new ImageView();
	public void setRacinetteDeux() {
		racinetteDeux.setImage(new Image("vue/badge/racinette.png"));
		racinetteDeux.setScaleX(0.5);
		racinetteDeux.setScaleY(0.5);
		racinetteDeux.setLayoutX(55);
		racinetteDeux.setLayoutY(50);
	}
	
	protected ImageView dragon = new ImageView();
	public void setVagues() {
		dragon.setImage(new Image("vue/badge/dragon.png"));
		dragon.setLayoutX(70);
		dragon.setLayoutY(180);
	}
	
	public void setCouleur(COULEUR couleur) {
		if (couleur == COULEUR.BLEU)
			this.setStyle("-fx-background-color:blue");
		else if (couleur == COULEUR.JAUNE)
			this.setStyle("-fx-background-color:yellow");
		else if (couleur == COULEUR.NOIR)
			this.setStyle("-fx-background-color:black");
		else if (couleur == COULEUR.ROUGE)
			this.setStyle("-fx-background-color:red");
	}
	
	public BadgeRacinette ALaRacinetteBrune() {
		setCouleur(COULEUR.JAUNE);
		return this;
	}
}
