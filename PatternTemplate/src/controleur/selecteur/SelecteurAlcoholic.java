package controleur.selecteur;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import modele.Cocktail;

public class SelecteurAlcoholic extends Moulinette {

	public SelecteurAlcoholic(List<Cocktail> cocktails) {
		super(cocktails);
	}

	@Override
	public void filtrer() {
		System.out.println("SelecteurAlcoholic.filtrer()");
		
		List<Cocktail> selection = new ArrayList<Cocktail>();
		for(Cocktail cocktail: cocktailsOriginaux) {
			//Si le cocktail est alcoolique
			if (cocktail.getStr_alcoholic().contains("Alcoholic")) {
				selection.add(cocktail);
			}
		}
		this.cocktailsSelectionnes = selection;
	}

	@Override
	public void trier() {
		System.out.println("SelecteurAlcoholic.trier()");
		
		this.cocktailsSelectionnes.sort(new Comparateur());
		//this.cocktailsSelectionnes.sort(null);
	}

	@Override
	public void transformer() {
		
	}
	
	@SuppressWarnings("hiding")
	public class Comparateur implements Comparator<Cocktail>
	{
		@Override
		public int compare(Cocktail a, Cocktail b) {
			return a.getStr_drink().compareTo(b.getStr_drink());
		}
		
	}
}
