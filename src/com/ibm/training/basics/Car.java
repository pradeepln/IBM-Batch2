package com.ibm.training.basics;
//                IS A
public class Car extends Vehicle {
	
	//car has stuff related ac,music
	
	@Override
	public void start() {
		System.out.println("<<<< Car Starting >>>>");
		//playMusic();
	}
	
	@Override
	public void stop() {
		System.out.println("<<<< Car Stopping >>>>");
	}
	
	public void playMusic() {
		System.out.println("<<<< la ,la , la... >>>>");
	}

}
