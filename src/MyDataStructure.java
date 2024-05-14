
public class MyDataStructure {
	Object[] internal;
	
	public void addElement(Object anElement) {
		
		internal[0] = anElement;
	}

	public static void main(String[] args) {
		MyDataStructure ds = new MyDataStructure();
		
		ds.addElement("stringValue");
		Car c = new Car();
		ds.addElement(c);
		ChemicalElement h = new ChemicalElement(1, "Hy", "H");
		ds.addElement(h);

	}

}
