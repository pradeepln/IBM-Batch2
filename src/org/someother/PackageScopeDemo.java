package org.someother;

import com.ibm.training.basics.Car;
import com.ibm.training.basics.Driver;
import com.ibm.training.basics.*;

import static java.lang.Math.*;

public class PackageScopeDemo {

	public static void main(String[] args) {
		
		Driver d = new Driver();
		
		Car c = new Car();

		java.sql.Driver dr;
		
		//Derived der = new Derived(); //not a public class , so can't access here 
		
		FixedArrayStack fas = new FixedArrayStack(23); //public class
		
		//System.out.println(fas.top); // top is default access, so can't access here
		
		Employee e = new Employee(34, "fjf");
		//e.salary = -1;
	}
	
	public void someMathAlgo() {
//		double sin90 = Math.sin(90);
//		double cost90 = Math.cos(90);
		//many more such static calls...
		double sin90 = sin(90);
		double cost90 = cos(90);
		
	}

}
