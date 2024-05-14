package com.ibm.training.basics;

public class ChemicalElement {
	
	private int atomicNumber;
	private String name;
	private String symbol;
	
	private static boolean[] alkaliMetals = new boolean[120];
	
	static {
		alkaliMetals[3] = true;
		alkaliMetals[11] = true;
		alkaliMetals[19] = true;
		alkaliMetals[37] = true;
		alkaliMetals[55] = true;
		alkaliMetals[87] = true;
	}
	
	
	
	public ChemicalElement(int atomicNumber,String name,String symbol) {
		if(atomicNumber <= 0) {}
		this.atomicNumber = atomicNumber;
		this.name = name;
		this.symbol = symbol;
	}

	public boolean isAlkaliMetal() {
		
		return alkaliMetals[atomicNumber];
	}
	
	public boolean isTransitionMetal() {
		return (atomicNumber >= 21 && atomicNumber <= 31) || 
			   (atomicNumber >= 39 && atomicNumber <= 48) ||
			   (atomicNumber >= 72 && atomicNumber <= 80) ||
			   (atomicNumber >= 104 && atomicNumber <= 112);
	}
	
	public boolean isMetal() {
				
		switch(atomicNumber) {
		case 13, 49, 50, 81, 82, 83, 113, 114, 115, 116: return true;
		default : return false;
		}
		
		/* this version for prior to java 16
		 * switch(atomicNumber) { case 13: case 49: case 50: case 81: case 82: case 83:
		 * case 113: case 114: case 115: case 116: return true;
		 * 
		 * default: return false; }
		 */
	}
	
	//quality to be improved
	public boolean equals(Object o) {
		ChemicalElement other = (ChemicalElement) o;
		return this.atomicNumber == other.atomicNumber;
			
	}

	public int getAtomicNumber() {
		return atomicNumber;
	}

	
	public String getName() {
		return name;
	}

	

	public String getSymbol() {
		return symbol;
	}

	
	
	
}
