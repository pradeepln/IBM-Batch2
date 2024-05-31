package com.ibm.training.solid;

//DRY

public abstract class Vehicle  {
	TemperatureController tc = new TemperatureController();
	
	public Vehicle() {
		tc.manageTemperature(50, 30);
	}
	
//	String fan;
//	public void manageTemperature(int high,int low) {
//		//logic to bring temp from high to low
//	}
	//things common to all vehicles like engine,tank etc 
	//this is new comment
	public abstract void start(); /*{
		System.out.println("------ Vehicle Start ------");
	}*/
	
	public abstract void stop(); /*{
		System.out.println("------ Vrhicle Stop ------");
	}*/

}
