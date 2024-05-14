package com.ibm.training.basics;


public class VarInitiaialization {

	int j; //instance var 0,null,false
	
	
	static String name; //static var
	static boolean isOK;
	
	public static void main(String[] args) {
		int i; //local var
		
		i = 43;
		
		System.out.println(i);
		
		VarInitiaialization obj = new VarInitiaialization();
		System.out.println(obj.j);
		System.out.println(name);
		System.out.println(isOK);
		
		
//		obj.j++;
//		System.out.println(obj.j);
	}

}
