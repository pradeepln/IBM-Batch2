package com.ibm.training.collections;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
//		Set<String> uniqueWords = new HashSet<>();
		Set<String> uniqueWords = new LinkedHashSet<>();
		
		Scanner kb = new Scanner(System.in);
		while(true) {
			System.out.println("Enter a unique word: ");
			String input = kb.nextLine();
			if(input.equalsIgnoreCase("quit")) { break;}
			
			boolean added = uniqueWords.add(input);
			if(!added) {
				System.out.println("That is a duplicated word!");
			}
		}
		
		System.out.println("_______ all unique words _________");
		
		for(String aWord : uniqueWords) {
			System.out.println(aWord);
		}

	}

}
