package com.ibm.training.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListConversion {

	public static void main(String[] args) {
		String[] words = {"this","is","a","bumch","of","strange","words","like","xylophone"};
		
		System.out.println(words);
		System.out.println(Arrays.asList(words));
		
		List<String> wordList = new ArrayList<>();
		for(String s : words) {
			wordList.add(s);
		}
		
		List<String> list2 = Arrays.asList(words);
		System.out.println(list2);
	}

}
