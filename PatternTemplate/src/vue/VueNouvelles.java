package vue;

import java.util.List;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurNouvelles;
import javafx.scene.control.Label;
import modele.Nouvelle;

public class VueNouvelles extends Vue {

	protected ControleurNouvelles controleur = null;
	protected static VueNouvelles instance = null; 
	public static VueNouvelles getInstance() {if(null==instance)instance = new VueNouvelles();return VueNouvelles.instance;}; 

	private VueNouvelles() {
		super("nouvelles.fxml", VueNouvelles.class);
		Logger.logMsg(Logger.INFO, "new VueNouvelles()");
		super.controleur = this.controleur = new ControleurNouvelles();
	}

	public void afficherNouvelles(List<Nouvelle> nouvelles) {
		
		//On sait que on a 3 espaces
		int position = 0;
		for(Nouvelle nouvelle : nouvelles)
		{
			position++;
			if(position >= 3) break;
			
			String id = "#nouvelle-titre-" + position;
			Label vueTitre = (Label) lookup(id);
			vueTitre.setText(nouvelle.getTitre());
			
			String auteur = "#nouvelle-auteur-" + position;
			Label vueAuteur = (Label) lookup(auteur);
			vueAuteur.setText(nouvelle.getAuteur());
			
			//String resume = "#nouvelle-resume-" + position;
			//Label vueResume = (Label) lookup(resume);
			//vueResume.setText(nouvelle.getResume());
			
			String date = "#nouvelle-date-" + position;
			Label vueDate = (Label) lookup(date);
			vueDate.setText(nouvelle.getDate());
		}
	}
	

}
