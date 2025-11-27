package controleur;


import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import vue.VueTableauHonneur;

public class ControleurTableauHonneur extends Controleur{
	
	public ControleurTableauHonneur()
	{
		Logger.logMsg(Logger.INFO, "new ControleurTableauHonneur()");
	}
	
	public void initialiser()
	{
		//VueJardinator.getInstance().afficherTerrain();
	}


}
