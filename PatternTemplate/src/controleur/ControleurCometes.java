package controleur;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import data.CometeDAO;
import modele.Comete;
import vue.VueCometes;

public class ControleurCometes extends Controleur {

	public ControleurCometes()
	{
		Logger.logMsg(Logger.INFO, "new ControleurCometes()");
	}

	public void initialiser()
	{
		CometeDAO dao = new CometeDAO();
		Comete comete = dao.listerCometes();
        VueCometes.getInstance().afficherComete(comete);
	}
}
