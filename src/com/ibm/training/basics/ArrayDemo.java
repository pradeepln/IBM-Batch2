package com.ibm.training.basics;

public class ArrayDemo {

	static int[] arryOfInts;
	
	public static void main(String[] args) {
		arryOfInts = new int[5];
		
		arryOfInts[0] = 99;
		
		System.out.println(arryOfInts[0]);
		System.out.println(arryOfInts[1]);
		System.out.println(arryOfInts[2]);
		System.out.println(arryOfInts[3]);
		System.out.println(arryOfInts[4]);
		
		String[] seasons = {"winter","summer","rainy"};
		
		System.out.println("How many seasons? "+seasons.length);
		
		System.out.println("What are the seasons? ");
		
		for(int i=0;i<seasons.length;i++) {
			System.out.println(seasons[i]);
		}

	}

}
