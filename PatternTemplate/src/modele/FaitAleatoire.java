package modele;

public class FaitAleatoire {
	protected int id;
	protected String text;
	protected String source;
	protected String source_url;
	protected String language;
	protected String permalink;
	
	public FaitAleatoire(int id, String text, String source, String source_url, String language, String permalink) {
		super();
		this.id = id;
		this.text = text;
		this.source = source;
		this.source_url = source_url;
		this.language = language;
		this.permalink = permalink;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getSource_url() {
		return source_url;
	}
	public void setSource_url(String source_url) {
		this.source_url = source_url;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getPermalink() {
		return permalink;
	}
	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}
}
