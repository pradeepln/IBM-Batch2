package com.ibm.training.basics;

public class PrimitiveRanges {

	public static void main(String[] args) {
		int i = 20;
		System.out.println("i = "+i);
		
		System.out.println("Integer max = "+Integer.MAX_VALUE);
		System.out.println("Integer min = "+Integer.MIN_VALUE);
		
		i = Integer.MAX_VALUE + 1;
		System.out.println("i = "+i);
		
		char ch = 'A';
		System.out.println(ch);
		ch++;
		System.out.println(ch);
		int ascii = ch;
		System.out.println(ascii);
	}

}
