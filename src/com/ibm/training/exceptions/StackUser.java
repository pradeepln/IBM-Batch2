package com.ibm.training.exceptions;

public class StackUser {
	
	public void fill(Stack s) {
		
		for(int i = 0; i < 10; i++) {
			s.push(i); //auto-boxing at work
			System.out.println("Pushed ------> "+i);
		}
	}

}
