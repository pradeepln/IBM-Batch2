package com.ibm.training.singleton;

public class User {

	public static void main(String[] args) {
//		Singleton instance1 = new Singleton();
//
//		Singleton instnce2 = new Singleton();
		
		Singleton i1 = Singleton.getInstance();
		
		Singleton i2 = Singleton.getInstance();
		
		//Singleton.instance = null;
	}

}
