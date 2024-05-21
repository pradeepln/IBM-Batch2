package com.ibm.training.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.ibm.training.basics.Employee;

public class ListDemo {

	public static void main(String[] args) {
		//simpleRawListOps();
		//genericArrayList();
		
		List<String> list = new LinkedList<>();
		list.add("abc");
		list.add("xyz");
		list.add("tvf");
		
		someAlgo(list);
	}

	private static void someAlgo(List<String> list) {
		
		//some complex logic
		list.add(0, "first");
		
		//lots of logic....
		list.remove(1);
		
		//compute randomIndex
		int randomIndex = 2;
		//lots of stuff
		list.get(randomIndex);
		
		
		//looping
		//DON'T DO THIS KIND OF LOOP USING GET(I)
		for(int i=0;i<list.size();i++) {
			String aValue = list.get(i);
			//do whatever with aValue
			//System.out.println(aValue);
		}
		
		//Explicit iterator
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String aValue = it.next();
			
			//do whatever with aValue
			/*
			 * if(aValue.startsWith("x")) { it.remove(); }
			 */
		}
		
		//Implicit Iterator or enhanced for/for-each
		
		for(String aValue : list) {
			//do whatever with aValue
		}
		
//		ListIterator<String> li = list.listIterator();
//		while(li.hasNext()) {
//			String aValue = li.next();
//			//
//			li.add("temop");
//		}
	}

	private static void genericArrayList() {
		ArrayList<String> sList = new ArrayList<String>(); // List is declaration is generic. sList is a specific type of list
		
		sList.add("hello");
		sList.add("123");
		
		//sList.add(432.9); //caught at compile time
		
		ArrayList<Integer> iList = new ArrayList<Integer>(); //iList is a specific type of list 
		
		//iList.add("123");//compile time type safety
		iList.add(123);
		iList.add(new Integer(877));
		
		//iList.add(23.4);//compile time type safety
		
		String aString = sList.get(0);
		int aValue = iList.get(0);
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
