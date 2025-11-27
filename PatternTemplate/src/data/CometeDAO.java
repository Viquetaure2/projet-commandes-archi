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
import modele.Comete;

public class CometeDAO {
	
	public Comete listerCometes() {
		System.out.println("CometeDAO.listerComete()");
		
		String URL_COMETES = "https://cobs.si/api/comet.api?id=421&alt-des=true&orbit=true&phys-par=true";
		String json = "";
		
		try {
			URL url = new URL(URL_COMETES);
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
		JsonObject cometeJson = document.get("object").getAsJsonObject();
		
		String type = cometeJson.get("type").getAsString();
		String name = cometeJson.get("name").getAsString();
		String component;
		if (cometeJson.get("component").isJsonNull()) {
			component = "null";
		} else {
			component = cometeJson.get("component").getAsString();
		}
		String current_mag = cometeJson.get("current_mag").getAsString();
		
		System.out.println(type + ", " + name + ", " + component + ", " + current_mag);
		return new Comete(0, type, name, component, current_mag);
	}
}
