package data;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import modele.JeuCarte;

public class JeuCarteDAO {
	
	public JeuCarte listerJeuxCartes() {
		System.out.println("JeuCarteDAO.listerJeuxCartes()");
		
		String URL_FAITALEATOIRES = "https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1";
		String json = "";
		
		try {
			URL url = new URL(URL_FAITALEATOIRES);
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
		JsonObject jeuCarteJson = parseur.parse(json).getAsJsonObject();
		
		Boolean success = jeuCarteJson.get("success").getAsBoolean();
		String deck_id = jeuCarteJson.get("deck_id").getAsString();
		int remaining = jeuCarteJson.get("remaining").getAsInt();
		Boolean shuffled = jeuCarteJson.get("shuffled").getAsBoolean();
		
		System.out.println(success + ", " + deck_id + ", " + remaining + ", " + shuffled);
		return new JeuCarte(0, success, deck_id, remaining, shuffled);
	}
}
