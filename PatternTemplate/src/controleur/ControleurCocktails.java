package controleur;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import data.CocktailDAO;
import modele.Cocktail;
import vue.VueCocktails;

public class ControleurCocktails extends Controleur {

	public ControleurCocktails()
	{
		Logger.logMsg(Logger.INFO, "new ControleurCocktails()");
	}
	
	public void initialiser()
	{
		CocktailDAO dao = new CocktailDAO();
		List<Cocktail> cocktails = dao.listerCocktails();
        VueCocktails.getInstance().afficherCocktails2(cocktails);
	}

}


