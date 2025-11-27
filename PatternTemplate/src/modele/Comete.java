package modele;

public class Comete {
	protected int id;
	protected String type;
	protected String name;
	protected String component;
	protected String current_mag;
	
	public Comete(int id, String type, String name, String component, String current_mag) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.component = component;
		this.current_mag = current_mag;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getComponent() {
		return component;
	}
	public void setComponent(String component) {
		this.component = component;
	}
	public String getCurrent_mag() {
		return current_mag;
	}
	public void setCurrent_mag(String current_mag) {
		this.current_mag = current_mag;
	}
}
