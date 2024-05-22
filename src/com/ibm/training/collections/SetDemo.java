package com.ibm.training.collections;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
//		Set<String> uniqueWords = new HashSet<>();
//		Set<String> uniqueWords = new LinkedHashSet<>();
		TreeSet<String> uniqueWords = new TreeSet<>();
		
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
		
		//ascending order in case of treeset
//		for(String aWord : uniqueWords) {
//			System.out.println(aWord);
//		}
		
		for(String aWord : uniqueWords.descendingSet()) {
			System.out.println(aWord);
		}

	}

}
