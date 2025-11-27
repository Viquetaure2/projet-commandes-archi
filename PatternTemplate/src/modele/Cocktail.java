package modele;

public class Cocktail {
	protected int id;
	protected String str_drink;
	protected String str_category;
	protected String str_alcoholic;
	protected String verre;
	protected String str_instructions;
	
	public Cocktail(int id, String str_drink, String str_category, String str_alcoholic, String str_glass,
			String str_instructions) {
		super();
		this.id = id;
		this.str_drink = str_drink;
		this.str_category = str_category;
		this.str_alcoholic = str_alcoholic;
		this.verre = str_glass;
		this.str_instructions = str_instructions;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStr_drink() {
		return str_drink;
	}
	public void setStr_drink(String str_drink) {
		this.str_drink = str_drink;
	}
	public String getStr_category() {
		return str_category;
	}
	public void setStr_category(String str_category) {
		this.str_category = str_category;
	}
	public String getStr_alcoholic() {
		return str_alcoholic;
	}
	public void setStr_alcoholic(String str_alcoholic) {
		this.str_alcoholic = str_alcoholic;
	}
	public String getVerre() {
		return verre;
	}
	public void setStr_glass(String str_glass) {
		this.verre = str_glass;
	}
	public String getStr_instructions() {
		return str_instructions;
	}
	public void setStr_instructions(String str_instructions) {
		this.str_instructions = str_instructions;
	}
}
