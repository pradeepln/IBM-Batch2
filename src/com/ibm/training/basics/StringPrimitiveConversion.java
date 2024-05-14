package com.ibm.training.basics;

public class StringPrimitiveConversion {

	public static void main(String[] args) {
		int i = 34;
		
		//String s = (String) i;
		
		String numAsString = String.valueOf(i); //conversion not type cast

		String s = ""+i;
		
		String aNum = "1234";
		
		//int iNum = (int) aNum;
		
		int iNum = Integer.parseInt(aNum); // conversion, Float.parseFloat and so on
	}

}
