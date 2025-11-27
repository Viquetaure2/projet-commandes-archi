package vue;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurVehicules;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import modele.Vehicule;

public class VueVehicules extends Vue {
	
	protected ControleurVehicules controleur = null;
	protected static VueVehicules instance = null; 
	public static VueVehicules getInstance() {if(null==instance)instance = new VueVehicules();return VueVehicules.instance;}; 
	
	private VueVehicules()  {
		super("vehicules.fxml", VueVehicules.class);
		Logger.logMsg(Logger.INFO, "new VueVehicules()");
		super.controleur = this.controleur = new ControleurVehicules();
	}
	
	public void afficherVehicule(Vehicule vehicule) {
		Label vueErrorCode = (Label)lookup("#error-code");
		vueErrorCode.setText(String.valueOf(vehicule.getError_code()));
		
		Label vueDescriptor = (Label)lookup("#descriptor");
		vueDescriptor.setText(vehicule.getVehicle_descriptor());
		
		Label vueManufacturer = (Label)lookup("#manufacturer");
		vueManufacturer.setText(vehicule.getManufacturer_name());
		
		Label vueCity = (Label)lookup("#plant-city");
		vueCity.setText(vehicule.getPlant_city());
		
		Label vueMake = (Label)lookup("#make");
		vueMake.setText(vehicule.getMake());
		
		Label vueModel = (Label)lookup("#model");
		vueModel.setText(vehicule.getModel());
		
		Label vueYear = (Label)lookup("#year");
		vueYear.setText(toString().valueOf(vehicule.getModel_year()));
	}
}
