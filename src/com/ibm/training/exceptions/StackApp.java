package com.ibm.training.exceptions;

public class StackApp {

	public static void main(String[] args) {
		StackUser u = new StackUser();
		
		FixedArrayStack stackObj = new FixedArrayStack(9);
		
		//DynStack stackObj = new DynStack();
		
		u.fill(stackObj); //type substitution

	}

}
