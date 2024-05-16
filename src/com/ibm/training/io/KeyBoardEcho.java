package com.ibm.training.io;

import java.io.IOException;

public class KeyBoardEcho {

	public static void main(String[] args) {
		System.out.println("Enter something: ");
		
		try {
			while(true) {
				int aByte = System.in.read();
				if(aByte == 13) {
					break;
				}
				System.out.write(aByte);
			}
			System.out.flush();
		}catch (IOException e) {
			System.out.println("I/O error while reading from keyboard? Lols.. keyboard broken?");
		}
	}

}
