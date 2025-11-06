package vue;
import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurBattlemaps;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import modele.COULEURS;
import modele.THEME;
import modele.TUILES;
public class VueBattlemaps extends Vue {

	protected ControleurBattlemaps controleur;
	protected static VueBattlemaps instance = null; 
	public static VueBattlemaps getInstance() {if(null==instance)instance = new VueBattlemaps();return VueBattlemaps.instance;}; 
	
	private VueBattlemaps() 
	{
		super("battlemaps.fxml", VueBattlemaps.class, 1294,743);
		super.controleur = this.controleur = new ControleurBattlemaps();
		Logger.logMsg(Logger.INFO, "new VueBattlemaps()");
	}
		
	public void activerControles()
	{
		super.activerControles();
		
		Text actionEditTitre = (Text) lookup("#title");
		actionEditTitre.setOnMouseClicked(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent e) {
				System.out.println("Clic Titre");
				controleur.notifierClicTitre(actionEditTitre);
			}});
		
		//Arnaud
		Button actionChoisirChemin = (Button) lookup("#action-choisir-chemin");
		actionChoisirChemin.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				System.out.println("Clic Chemin");
				controleur.notifierClicTuile(TUILES.CHEMIN);
			}});
		
		Button actionChoisirCheminTourne = (Button) lookup("#action-choisir-chemin2");
		actionChoisirCheminTourne.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				System.out.println("Clic Chemin Virage");
				controleur.notifierClicTuile(TUILES.CHEMIN_VIRAGE);
			}});
		
		Button actionChoisirRiviere = (Button) lookup("#action-choisir-riviere");
		actionChoisirRiviere.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				System.out.println("Clic Riviere");
				controleur.notifierClicTuile(TUILES.RIVIERE);
			}});
		
		Button actionChoisirTresor = (Button) lookup("#action-choisir-tresor");
		actionChoisirTresor.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				System.out.println("Clic Tresor");
				controleur.notifierClicTuile(TUILES.TRESOR);
			}});
		
		Button actionThemePlaine = (Button) lookup("#action-theme-plaine");
		actionThemePlaine.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				System.out.println("Clic Theme Plaine");
				controleur.notifierClicTheme(THEME.PLAINE);
			}});

		Button actionThemeNeige = (Button) lookup("#action-theme-neige");
		actionThemeNeige.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				System.out.println("Clic Theme Neige");
				controleur.notifierClicTheme(THEME.NEIGE);
			}});
		
		Button actionThemeDesert = (Button) lookup("#action-theme-desert");
		actionThemeDesert.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				System.out.println("Clic Theme Desert");
				controleur.notifierClicTheme(THEME.DESERT);
			}});
		
		//Victor
		Button actionChoisirForet = (Button) lookup("#action-choisir-foret");
		actionChoisirForet.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Clic Foret");
				controleur.notifierClicTuile(TUILES.FORET);
			}
		});
		
		Button actionChoisirRoches = (Button) lookup("#action-choisir-roches");
		actionChoisirRoches.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Clic Roches");
				controleur.notifierClicTuile(TUILES.ROCHES);
			}
		});
		
		Button actionChoisirMaison = (Button) lookup("#action-choisir-maison");
		actionChoisirMaison.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Clic Maison");
				controleur.notifierClicTuile(TUILES.MAISON);
			}
		});
		
		Button actionChoisirTour = (Button) lookup("#action-choisir-tour");
		actionChoisirTour.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Clic Tour");
				controleur.notifierClicTuile(TUILES.TOUR);
			}
		});
		
		//		
		Button actionChoisirJaune = (Button) lookup("#bouton-choisir-jaune");
		actionChoisirJaune.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Clic Jaune");
				controleur.notifierClicCouleur(COULEURS.JAUNE);
			}
		});
		
		Button actionChoisirRouge = (Button) lookup("#bouton-choisir-rouge");
		actionChoisirRouge.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Clic Rouge");
				controleur.notifierClicCouleur(COULEURS.ROUGE);
			}
		});
		
		Button actionChoisirVert = (Button) lookup("#bouton-choisir-vert");
		actionChoisirVert.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Clic Vert");
				controleur.notifierClicCouleur(COULEURS.VERT);
			}
		});
		
		Button actionChoisirBleu = (Button) lookup("#bouton-choisir-bleu");
		actionChoisirBleu.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Clic Bleu");
				controleur.notifierClicCouleur(COULEURS.BLEU);
			}
		});
		
		GridPane carte = (GridPane) lookup("#map");
		carte.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent e) {
				System.out.println("Ajout d'une tuile");
				double posX = e.getX();
				double posY = e.getY();

			    // Get total number of columns and rows (assuming uniform sizing)
			    int nbCol = carte.getColumnConstraints().size();
			    int nbLigne = carte.getRowConstraints().size();
				
			    double cellLargeur = carte.getWidth() / nbCol;
			    double CellHauteur = carte.getHeight() / nbLigne;
			    int col = (int) (posX / cellLargeur);
			    int rangee = (int) (posY / CellHauteur);
				controleur.notifierClicCarte(col, rangee);
			}});
		
		Button actionUndo = (Button)lookup("#action-undo");
		actionUndo.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				controleur.notifierActionUndo();
				
			}
			
		})
	}

	public void placerTuile(TUILES tuileChoisi, COULEURS couleurChoisie, int posX, int posY) {
		String path = null;
		if (tuileChoisi == TUILES.CHEMIN) {
			path = "vue/decoration/tiles/pathBase.png";
		}else if (tuileChoisi == TUILES.CHEMIN_VIRAGE) {
			path = "vue/decoration/tiles/pathTurn.png";
		}
		else if (tuileChoisi == TUILES.RIVIERE) {
			path = "vue/decoration/tiles/riverBase.png";
		}
		else if (tuileChoisi == TUILES.TRESOR) {
			path = "vue/decoration/tiles/treasureChest.png";
		}
		else if (tuileChoisi == TUILES.FORET) {
			path = "vue/decoration/tiles/foret.png";
		}
		else if (tuileChoisi == TUILES.ROCHES) { 
			path = "vue/decoration/tiles/roches.png";
		}
		else if (tuileChoisi == TUILES.MAISON) {
			if (couleurChoisie == COULEURS.JAUNE) {
				path = "vue/decoration/tiles/maison.png";}
			else if (couleurChoisie == COULEURS.ROUGE) {
				path = "vue/decoration/tiles/maisonRouge.png";}
			else if (couleurChoisie == COULEURS.VERT) {
				path = "vue/decoration/tiles/maisonVerte.png";}
			else if (couleurChoisie == COULEURS.BLEU) {
				path = "vue/decoration/tiles/maisonBleue.png";}
		}
		else if (tuileChoisi == TUILES.TOUR) {
			path = "vue/decoration/tiles/tour.png";
		}
		
		if (path != null) {
			ImageView tuilePosee = new ImageView(new Image(path));
			tuilePosee.setFitWidth(100);
		    tuilePosee.setFitHeight(98);
		    
		    GridPane carte = (GridPane) lookup("#map");
		    GridPane.setColumnIndex(tuilePosee, posX);
		    GridPane.setRowIndex(tuilePosee, posY);
		    carte.getChildren().add(tuilePosee);
		}
		
	}

	public void changerTheme(THEME theme) {
		String path = null;
		
		if (theme == THEME.PLAINE) {
			path = "vue/decoration/terrain/plaines.png";}
		else if (theme == THEME.NEIGE) {
			path = "vue/decoration/terrain/neige.png";}
		else if (theme == THEME.DESERT) {
			path = "vue/decoration/terrain/desert.png";}
		
	
		ImageView backgroundMap = (ImageView) lookup("#background");
		backgroundMap.setImage(new Image(path));
	}
}