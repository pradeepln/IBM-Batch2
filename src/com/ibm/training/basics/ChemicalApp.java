package com.ibm.training.basics;

public class ChemicalApp {

	public static void main(String[] args) {
		ChemicalElement h = new ChemicalElement(1,"Hydrogen","H");
		ChemicalElement k = new ChemicalElement(19,"Potassium","K");
		ChemicalElement ga = new ChemicalElement(31, "Gallium", "Ga");
		ChemicalElement o = new ChemicalElement(8, "Oxygen", "O");
		
//		System.out.println("Is Gallium a transition metal? "+ga.isTransitionMetal());
//		System.out.println("Is Gallium a Alkali? "+ga.isAlkaliMetal());
//		System.out.println("Is Potassium a metal? "+k.isMetal());
//		System.out.println("Is Potassium an alkali metal? "+k.isAlkaliMetal());
//		System.out.println("Is Oxygen a metal? "+o.isMetal());
		
		printDetails(h);
		printDetails(ga);
		printDetails(k);
		//----------------------------- Equality follows :
		
		ChemicalElement h2 = new ChemicalElement(1, "Hydrogenium", "h");
		
		System.out.println("h == h2 "+ (h == h2));
		System.out.println("h == k "+ (h == k));
		System.out.println("h.equals(k) "+ (h.equals(k)));
		System.out.println("h.equals(h2) "+ (h.equals(h2)));
		
	}
	
	public static void printDetails(ChemicalElement c) {
		
		//c.setAtomicNumber(-1);
		System.out.println("_______________");
		System.out.println("Atomic Number: "+ c.getAtomicNumber());
		System.out.println("Name: "+c.getName());
		System.out.println("Symbol: "+c.getSymbol());
		System.out.println("Is it a transition metal? "+c.isTransitionMetal());
		System.out.println("Is it an Alkali? "+c.isAlkaliMetal());
		System.out.println("Is it a metal? "+c.isMetal());
		System.out.println("_______________");
	}

}
