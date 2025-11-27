package controleur;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import data.JeuCarteDAO;
import modele.JeuCarte;
import vue.VueJeuxCarte;

public class ControleurJeuxCarte extends Controleur {

	public ControleurJeuxCarte()
	{
		Logger.logMsg(Logger.INFO, "new ControleurJeuxCarte()");
	}
	
	public void initialiser()
	{
		JeuCarteDAO dao = new JeuCarteDAO();
		JeuCarte jeuCarte = dao.listerJeuxCartes();
		VueJeuxCarte.getInstance().afficherJeuCarte(jeuCarte);
	}

	
}
