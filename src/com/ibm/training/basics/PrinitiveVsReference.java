package com.ibm.training.basics;

public class PrinitiveVsReference {

	public static void main(String[] args) {
		
		//-- primitives ---> notice no 'new' op is reqd. mem is allocated on the stack
		int age = 42;
		boolean isWorking = true;
		char firstLetter = 'A';
		
		//-- refs ---> 'new' is needed to allocate mem. allocated on the heap
		StringBuilder sb = new StringBuilder();
		int[] ages = new int[10];
		
		String name = new String("Pradeep");
		
		//---- Pass by value vs pass by reference
		ages[0] = 24;
		method1(age); // pass by value
		System.out.println(age);
		method2(ages); // objects and arrays are passed by reference
		System.out.println(ages[0]);
		
	}

	
	public static void method1(int x) {
		x++; // x = x+1;
	}
	
	public static void method2(int[] iArray) {
		iArray[0]++; // iArray[0] = iArray[0]+1
	}
}
