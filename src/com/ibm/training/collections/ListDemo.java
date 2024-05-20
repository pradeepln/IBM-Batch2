package com.ibm.training.collections;

import java.util.ArrayList;

import com.ibm.training.basics.Employee;

public class ListDemo {

	public static void main(String[] args) {
		simpleRawListOps();

	}

	private static void simpleRawListOps() {
		ArrayList l = new ArrayList();
		System.out.println("Size initial: "+l.size());
		
		l.add("first");
		l.add("second");
		l.add(3);
		l.add(new Employee(4, "fourth"));
		System.out.println("Size after 4 adds: "+l.size());
		
		System.out.println(l);
		
		l.add(1, "one and half");
		
		System.out.println(l);
		l.add(2,"one point seven");
		System.out.println(l);
		
		l.remove(3);
		
		System.out.println(l);
		
		l.set(3, 42);
		System.out.println(l);
		
		String first = (String) l.get(0); 
		Integer forty2 = (Integer) l.get(3);
		Employee emp = (Employee) l.get(4);
	}

}
