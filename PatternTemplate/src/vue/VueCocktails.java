package vue;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurCocktails;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import modele.Cocktail;

public class VueCocktails extends Vue {
	
	protected ControleurCocktails controleur = null;
	protected static VueCocktails instance = null; 
	public static VueCocktails getInstance() {if(null==instance)instance = new VueCocktails();return VueCocktails.instance;}; 
	
	private VueCocktails()  {
		super("cocktails.fxml", VueCocktails.class);
		Logger.logMsg(Logger.INFO, "new VueCocktails()");
		super.controleur = this.controleur = new ControleurCocktails();
	}
	
	public void afficherCocktail(Cocktail cocktail1) {
		Label vueCocktail = (Label)lookup("#cocktail-nom-1");
		vueCocktail.setText(cocktail1.getStr_drink());
	}
	
	public void afficherCocktails2(List<Cocktail> cocktails) {
		int nbrFor = 1;
		for (Cocktail cocktail : cocktails) {
			Label vueNom = (Label)lookup("#cocktail-nom-" + nbrFor);
			vueNom.setText(cocktail.getStr_drink());
			
			Label vueCategory = (Label)lookup("#cocktail-category-" + nbrFor);
			vueCategory.setText(cocktail.getStr_category());
			
			Label vueAlcoholic = (Label)lookup("#cocktail-alcoholic-" + nbrFor);
			vueAlcoholic.setText(cocktail.getStr_alcoholic());
			
			Label vueGlass = (Label)lookup("#cocktail-glass-" + nbrFor);
			vueGlass.setText(cocktail.getVerre());
			
			Label vueInstructions = (Label)lookup("#cocktail-instructions-" + nbrFor);
			vueInstructions.setText(cocktail.getStr_instructions());
			
			nbrFor++;
		}
	}
}
