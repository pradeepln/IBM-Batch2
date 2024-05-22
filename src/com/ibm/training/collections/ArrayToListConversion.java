package com.ibm.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ArrayToListConversion {

	public static void main(String[] args) {
		String[] words = {"this","is","a","bumch","of","strange","words","like","xylophone"};
		
		System.out.println(words);
		System.out.println(Arrays.asList(words));
		
//		List<String> wordList = new ArrayList<>();
//		for(String s : words) {
//			wordList.add(s);
//		}
//		System.out.println(wordList);
//		
//		List<String> list2 = Arrays.asList(words);
//		System.out.println(list2);
//		
//		System.out.println("_____________ after change of array _____________");
//		words[3] = "bunch";
//		System.out.println(wordList);
//		System.out.println(list2);
//		list2.add("more");
	}

}
