package data;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import modele.Vehicule;

public class VehiculeDAO {
	
	public Vehicule listerVehicules() {
		System.out.println("VehiculeDAO.listerVehicules()");
		
		String URL_VEHICULES = " https://vpic.nhtsa.dot.gov/api/vehicles/decodevin/5UXWX7C5*BA?format=xml&modelyear=2011";
		String xml = "";
		
		try {
			URL url = new URL(URL_VEHICULES);
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			
			lecteur.useDelimiter("\\A");
			xml= lecteur.next();
			lecteur.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		try {
			DocumentBuilder parseur = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = parseur.parse(new ByteArrayInputStream(xml.getBytes()));
			NodeList listeNoeudsVehicules = document.getElementsByTagName("Response");
			
			for (int position = 0; position < listeNoeudsVehicules.getLength(); position++) {
				Node noeudVehicule = listeNoeudsVehicules.item(position);
				Element xmlVehicule = (Element)noeudVehicule;
				
				String errorCode = xmlVehicule.getElementsByTagName("Value").item(1).getTextContent();
				String vehiculeDescriptor = xmlVehicule.getElementsByTagName("Value").item(4).getTextContent();
				String manufacturerName = xmlVehicule.getElementsByTagName("Value").item(6).getTextContent();
				String model = xmlVehicule.getElementsByTagName("Value").item(7).getTextContent();
				String modelYear = xmlVehicule.getElementsByTagName("Value").item(8).getTextContent();
				String plantCity = xmlVehicule.getElementsByTagName("Value").item(9).getTextContent();
				String make = xmlVehicule.getElementsByTagName("Value").item(5).getTextContent();
				
				System.out.println(errorCode + ", " + vehiculeDescriptor + ", " + manufacturerName + ", " + model + ", " + 
				modelYear + ", " + plantCity + ", " + make);
				
				return new Vehicule(0, Integer.parseInt(errorCode), vehiculeDescriptor, manufacturerName, model, Integer.parseInt(modelYear), plantCity, make);
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		return null;
	}
}
