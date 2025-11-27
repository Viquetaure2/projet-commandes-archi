package data;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import modele.Cocktail;

public class CocktailDAO {
	
	public List<Cocktail> listerCocktails() {
		System.out.println("CocktailDAO.listerCocktails()");
		List<Cocktail> listReturn = new ArrayList<Cocktail>();
		//List<Cocktail> cocktails = new ArrayList<Cocktail>();
		
		String URL_COCKTAILS = "https://www.thecocktaildb.com/api/json/v1/1/search.php?s=margarita";
		String json = "";
		
		try {
			URL url = new URL(URL_COCKTAILS);
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			
			lecteur.useDelimiter("\\A");
			json = lecteur.next();
			lecteur.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		JsonParser parseur = new JsonParser();
		JsonObject document = parseur.parse(json).getAsJsonObject();
		JsonArray listeCocktails = document.get("drinks").getAsJsonArray();
		
		//position < 4 car sinon ça crée des erreurs de ne pas avoir de Label pour les autres dans VueCocktails. Mettez le à 5 et vous verrez.
		for(int position = 0; position < 4; position++) {
			Cocktail newCocktail;
			JsonObject cocktailJson = listeCocktails.get(position).getAsJsonObject();
			
			String strDrink = cocktailJson.get("strDrink").getAsString();
			String strCategory = cocktailJson.get("strCategory").getAsString();
			String strAlcoholic = cocktailJson.get("strAlcoholic").getAsString();
			String strGlass = cocktailJson.get("strGlass").getAsString();
			String strInstructions = cocktailJson.get("strInstructions").getAsString();
			
			newCocktail = new Cocktail(position, strDrink, strCategory, strAlcoholic, strGlass, strInstructions);
			listReturn.add(newCocktail);
			
			//System.out.println("-----------");
			//System.out.println(strDrink + ", " + strCategory + ", " + strAlcoholic + ", " + strGlass + ", "  + strInstructions);
		}
		
		return listReturn;
	}
}
