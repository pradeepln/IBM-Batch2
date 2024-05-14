package com.ibm.training.basics;

public class TypeCastingOfPrimitives {

	public static void main(String[] args) {
		
		int i = 45;
		
		long l = i; //implicit typecast at work here
		
		float f = 23.1f;

		int whole = (int) f;
		System.out.println(whole);
	}

}
