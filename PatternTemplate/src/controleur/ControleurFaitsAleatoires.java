package controleur;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import data.FaitAleatoireDAO;
import modele.FaitAleatoire;
import vue.VueFaitsAleatoires;

public class ControleurFaitsAleatoires extends Controleur {

	public ControleurFaitsAleatoires()
	{
		Logger.logMsg(Logger.INFO, "new ControleurFaitsAleatoires()");
	}
	
	public void initialiser()
	{
		FaitAleatoireDAO dao = new FaitAleatoireDAO();
		FaitAleatoire faitAleatoire = dao.listerFaitAleatoires();
		VueFaitsAleatoires.getInstance().afficherFaitAleatoire(faitAleatoire);
	}

}
