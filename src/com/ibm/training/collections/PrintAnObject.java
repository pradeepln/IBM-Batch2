package com.ibm.training.collections;

import com.ibm.training.basics.ChemicalElement;
import com.ibm.training.basics.Employee;

public class PrintAnObject {

	public static void main(String[] args) {
		ChemicalElement j = new ChemicalElement(1, "Hydrogen", "H");
		System.out.println(j);

		Employee e = new Employee(98, "hero");
		System.out.println(e);
		
		String s = "hello "+e;
		System.out.println(s);
	}

}
