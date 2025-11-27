
import architecture.Controleur;
import architecture.Fenetre;
import vue.VueTableauHonneur;

public class App {

	public static void main(String[] parametres) {
		Controleur.choisirVuePrincipale(VueTableauHonneur.class);
		Fenetre.launch(Fenetre.class, parametres);	
	}

}
