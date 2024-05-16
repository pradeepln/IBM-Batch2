package com.ibm.training.gc;

import com.ibm.training.basics.Car;
import com.ibm.training.basics.Employee;

public class GCDiscussion {

	public static void main(String[] args) {
		
		int localI = 42;
		m1();
		//Point X
	}

	private static void m1() {
		float localF = 1234f;
		
		Employee e1 = new Employee(7, "bond");
		
		m2(e1);
		//Point Y
	}

	private static void m2(Employee emp) {
		
		char ch = 'h';
		Car c = new Car();
		//Point X
		c.start();
	}

}
