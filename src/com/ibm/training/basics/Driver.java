package com.ibm.training.basics;

public class Driver {

	public void drive(Vehicle v) {
		v.start();
		
//		if(v instanceof Car) {
//			Car c = (Car) v;
//			c.playMusic();
//		}
		
		System.out.println("driver taking it out for a spin....");
		v.stop();
	}
	
	
	
}
