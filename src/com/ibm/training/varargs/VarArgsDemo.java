package com.ibm.training.varargs;

public class VarArgsDemo {

	public static void m1(int i) {
		
	}
	
	public static void m2(String s,int... nums) {

		System.out.println("length: "+nums.length);
		System.out.println(nums[0]);
		System.out.println(nums[1]);
	}

	public static void main(String... args) {
		m1(87);
		//int[] ia = {23,43} ;
		m2("sss",23,24,71);

	}

}
