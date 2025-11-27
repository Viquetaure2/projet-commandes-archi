package data;

import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import modele.FaitAleatoire;

public class FaitAleatoireDAO {
	
	public FaitAleatoire listerFaitAleatoires() {
		System.out.println("FaitAleatoireDAO.listerFaitAleatoire()");
		
		String URL_FAITALEATOIRES = "https://uselessfacts.jsph.pl/api/v2/facts/random";
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
		JsonObject faitAleatoireJson = parseur.parse(json).getAsJsonObject();
		
		String text = faitAleatoireJson.get("text").getAsString();
		String source = faitAleatoireJson.get("source").getAsString();
		String source_url = faitAleatoireJson.get("source_url").getAsString();
		String language = faitAleatoireJson.get("language").getAsString();
		String permalink = faitAleatoireJson.get("permalink").getAsString();
		
		System.out.println(text + ", " + source + ", " + source_url + ", " + language + ", " + permalink);
		return new FaitAleatoire(0, text, source, source_url, language, permalink);
	}
}
