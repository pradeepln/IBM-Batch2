package com.ibm.training.solid;

public class Cafeteria  {

	TemperatureController tc = new TemperatureController();
	
	public Cafeteria() {
		tc.manageTemperature(30, 20);
	}
}
