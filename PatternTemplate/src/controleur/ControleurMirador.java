package controleur;

import modele.Nouvelle;
import vue.VueMirador;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;

public class ControleurMirador extends Controleur{

	public ControleurMirador()
	{
		Logger.logMsg(Logger.INFO, "new ControleurMirador()");
	}
	
	public void initialiser()
	{
		Nouvelle nouvelle1 = new Nouvelle("Le projo est brisé");
		Nouvelle nouvelle2 = new Nouvelle("Le nouveau local est super");
		Nouvelle nouvelle3 = new Nouvelle("JavaFX est fantastique");
		
		//VueMirador.getInstance().afficherNouvelle(nouvelle3);
		
		List<Nouvelle> nouvellesDeEspace = new ArrayList<Nouvelle>();
		nouvellesDeEspace.add(nouvelle3);
		nouvellesDeEspace.add(nouvelle2);
		nouvellesDeEspace.add(nouvelle1);
		VueMirador.getInstance().afficherNouvelles(nouvellesDeEspace);
	}

}
