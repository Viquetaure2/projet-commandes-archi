package controleur.selecteur;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import modele.Cocktail;

public class SelecteurGlass extends Moulinette {

	public SelecteurGlass(List<Cocktail> cocktails) {
		super(cocktails);
	}

	@Override
	public void filtrer() {
		System.out.println("SelecteurGlass.filtrer()");
		
		List<Cocktail> selection = new ArrayList<Cocktail>();
		for(Cocktail cocktail: cocktailsOriginaux) {
			//Si le verre est un "cocktail glass" ou un "old-fashioned glass"
			if (cocktail.getVerre().compareTo("Cocktail glass") == 0 || cocktail.getVerre().compareTo("Old-Fashioned glass") == 0) {
				selection.add(cocktail);
			}
		}
		this.cocktailsSelectionnes = selection;
	}

	@Override
	public void trier() {
		System.out.println("SelecteurGlass.trier()");
		
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
			return a.getVerre().compareTo(b.getVerre());
		}
		
	}
}