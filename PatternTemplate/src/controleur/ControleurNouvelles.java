package controleur;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import modele.Nouvelle;
import vue.VueMirador;
import vue.VueNouvelles;
import data.NouvelleDAO;

public class ControleurNouvelles extends Controleur {

	public ControleurNouvelles()
	{
		Logger.logMsg(Logger.INFO, "new ControleurNouvelles()");
	}
	public void initialiser()
	{
		NouvelleDAO dao = new NouvelleDAO();
		
		VueNouvelles.getInstance().afficherNouvelles(dao.listerNouvelles());
	}

}
