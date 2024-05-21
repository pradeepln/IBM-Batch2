package com.ibm.training.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> runsMap = new HashMap<>();
		runsMap.put("rohit", 45);
		runsMap.put("gill", 78);
		runsMap.put("bumrah", 99);
		runsMap.put("virat", 23);
		runsMap.put("ms", 73);
		runsMap.put("virat", 51);
		
		Scanner kb = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a batsman name: ");
			String input = kb.nextLine();
			if(input.equalsIgnoreCase("quit")) { break;}
			
			if(runsMap.containsKey(input)) {
				Integer runs = runsMap.get(input);
				System.out.println(input+" ----> "+runs);
			}else {
				System.out.println("No Data for "+input);
			}
		}
		
		System.out.println("_____________ All Data in Map ________________");
		Set<String> keys = runsMap.keySet();
		
		for(String aKey : keys) {
			System.out.println(aKey+" ----> "+runsMap.get(aKey));
		}

	}

}
