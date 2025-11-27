
import java.util.List;

import architecture.Controleur;
import architecture.Fenetre;
import controleur.selecteur.*;
import data.*;
import modele.*;
import vue.*;

public class App {

	public static void main(String[] parametres) {	
		
		CocktailDAO cocktailDAO = new CocktailDAO();
		List<Cocktail> cocktails = cocktailDAO.listerCocktails();
		
		Moulinette selecteurAlcoholic = new SelecteurAlcoholic(cocktails);
		selecteurAlcoholic.executer();
		
		List<Cocktail> alcooliques = selecteurAlcoholic.getSelection();
		for (Cocktail cocktail: alcooliques) {
			System.out.println(cocktail.getStr_drink() + " - " + cocktail.getStr_category() 
			+ " - " + cocktail.getStr_alcoholic() + " - " + cocktail.getVerre() + " - " + cocktail.getStr_instructions());
		}
		
		System.out.println("");
		
		Moulinette selecteurGlass = new SelecteurGlass(cocktails);
		selecteurGlass.executer();
		
		List<Cocktail> verres = selecteurGlass.getSelection();
		for (Cocktail cocktail: verres) {
			System.out.println(cocktail.getStr_drink() + " - " + cocktail.getStr_category() 
			+ " - " + cocktail.getStr_alcoholic() + " - " + cocktail.getVerre() + " - " + cocktail.getStr_instructions());
		}
		
		/*
		cocktailDAO.listerCocktails();
		System.out.println("");
		
		CometeDAO cometeDAO = new CometeDAO();
		cometeDAO.listerCometes();
		System.out.println("");
		
		FaitAleatoireDAO faitAleatoireDAO = new FaitAleatoireDAO();
		faitAleatoireDAO.listerFaitAleatoires();
		System.out.println("");
		
		JeuCarteDAO jeuCarteDAO = new JeuCarteDAO();
		jeuCarteDAO.listerJeuxCartes();
		System.out.println("");
		
		VehiculeDAO vehiculeDAO = new VehiculeDAO();
		vehiculeDAO.listerVehicules();
		System.out.println("");
		*/
		
		//Controleur.choisirVuePrincipale(VueNouvelles.class);
		//Controleur.choisirVuePrincipale(VueCocktails.class);
		//Controleur.choisirVuePrincipale(VueCometes.class);
		//Controleur.choisirVuePrincipale(VueFaitsAleatoires.class);
		//Controleur.choisirVuePrincipale(VueJeuxCarte.class);
		//Controleur.choisirVuePrincipale(VueVehicules.class);
		//Fenetre.launch(Fenetre.class, parametres);
		
		
	}
	
}