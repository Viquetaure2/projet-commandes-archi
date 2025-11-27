package controleur.selecteur;

import java.util.ArrayList;
import java.util.List;

import modele.Cocktail;

public abstract class Moulinette {
	
	protected List<Cocktail> cocktailsOriginaux = null;
	protected List<Cocktail> cocktailsSelectionnes= null;
	//protected List<Persona> cocktailsFiltres = null;
	//protected List<Persona> cocktailsTries = null;
	//protected List<Persona> cocktailsTransformes = null;
	
	public Moulinette(List<Cocktail> personas) {
		this.cocktailsOriginaux = personas;
		this.cocktailsSelectionnes = new ArrayList<Cocktail>();
	}
	
	public void executer() {
		this.filtrer();
		this.trier();
		this.transformer();
	}
	
	public abstract void filtrer();
	public abstract void trier();
	public abstract void transformer();
	
	public List<Cocktail> getSelection() {
		return  cocktailsSelectionnes;
	}
}
