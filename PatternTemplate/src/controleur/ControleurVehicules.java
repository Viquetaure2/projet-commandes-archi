package controleur;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import data.VehiculeDAO;
import modele.Vehicule;
import vue.VueVehicules;

public class ControleurVehicules extends Controleur {

	public ControleurVehicules()
	{
		Logger.logMsg(Logger.INFO, "new ControleurCommentaires()");
	}
	public void initialiser()
	{
		VehiculeDAO dao = new VehiculeDAO();
		Vehicule vehicule = dao.listerVehicules();
		VueVehicules.getInstance().afficherVehicule(vehicule);
	}

}


