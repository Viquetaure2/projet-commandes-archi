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

import modele.Nouvelle;

public class NouvelleDAO {

	public List<Nouvelle> listerNouvelles() {
		System.out.println("NouvelleDAO.listerNouvelles()");
		List<Nouvelle> nouvelles = new ArrayList<Nouvelle>();
		
		String URL_NOUVELLES = "https://blog.devops.dev/feed";
		String xml = "";
		
		try {
			URL url = new URL(URL_NOUVELLES);
			InputStream flux = url.openConnection().getInputStream();
			Scanner lecteur = new Scanner(flux);
			lecteur.useDelimiter("\\A");
			xml = lecteur.next();
			System.out.println(xml);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		try {
			DocumentBuilder parseur = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			Document document = parseur.parse(new ByteArrayInputStream(xml.getBytes()));
			NodeList listeNoeudsNouvelles = document.getElementsByTagName("item");
			
			for(int position = 0; position < listeNoeudsNouvelles.getLength(); position++) {
				Node noeudNouvelle = listeNoeudsNouvelles.item(position);
				Element xmlNouvelle = (Element)noeudNouvelle;
				
				String titre = xmlNouvelle.getElementsByTagName("title").item(0).getTextContent();
				System.out.println(titre);
				
				Node noeudDescription = xmlNouvelle.getElementsByTagName("description").item(0);
                String description = "";
                if(null != noeudDescription)
                {
                    description = noeudDescription.getTextContent();
                    System.out.println(description);
                }
                
				String lien = xmlNouvelle.getElementsByTagName("link").item(0).getTextContent();
				System.out.println(lien);
				
				String auteur = xmlNouvelle.getElementsByTagName("dc:creator").item(0).getTextContent();
				System.out.println(auteur);
				
				String date = xmlNouvelle.getElementsByTagName("pubDate").item(0).getTextContent();
				System.out.println(date);
				
				Nouvelle nouvelle = new Nouvelle(titre);
				nouvelle.setAuteur(auteur);
				nouvelle.setDate(date);
				nouvelle.setResume(lien);
				nouvelle.setTitre(titre);
				nouvelles.add(nouvelle);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return nouvelles;
	}
}
