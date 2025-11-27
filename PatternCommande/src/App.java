
import architecture.Controleur;
import architecture.Fenetre;
import vue.VueBattlemaps;

public class App {

	public static void main(String[] parametres) {
		Controleur.choisirVuePrincipale(VueBattlemaps.class);
		Fenetre.launch(Fenetre.class, parametres);	
	}

}
