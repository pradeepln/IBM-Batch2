package com.ibm.training.singleton;

public class Singleton {
	
	//instance variables are very expensive/resource consuming
	
	private static Singleton instance;// = new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
