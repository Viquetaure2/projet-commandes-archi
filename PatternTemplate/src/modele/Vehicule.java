package modele;

public class Vehicule {
	protected int id;
	protected int error_code;
	protected String vehicle_descriptor;
	protected String manufacturer_name;
	protected String model;
	protected int model_year;
	protected String plant_city;
	protected String make;
	
	public Vehicule(int id, int error_code, String vehicle_descriptor, String manufacturer_name, String model,
			int model_year, String plant_city, String make) {
		super();
		this.id = id;
		this.error_code = error_code;
		this.vehicle_descriptor = vehicle_descriptor;
		this.manufacturer_name = manufacturer_name;
		this.model = model;
		this.model_year = model_year;
		this.plant_city = plant_city;
		this.make = make;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getError_code() {
		return error_code;
	}
	public void setError_code(int error_code) {
		this.error_code = error_code;
	}
	public String getVehicle_descriptor() {
		return vehicle_descriptor;
	}
	public void setVehicle_descriptor(String vehicle_descriptor) {
		this.vehicle_descriptor = vehicle_descriptor;
	}
	public String getManufacturer_name() {
		return manufacturer_name;
	}
	public void setManufacturer_name(String manufacturer_name) {
		this.manufacturer_name = manufacturer_name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getModel_year() {
		return model_year;
	}
	public void setModel_year(int model_year) {
		this.model_year = model_year;
	}
	public String getPlant_city() {
		return plant_city;
	}
	public void setPlant_city(String plant_city) {
		this.plant_city = plant_city;
	}
}
