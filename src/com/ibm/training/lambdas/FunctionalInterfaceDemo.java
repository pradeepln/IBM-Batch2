package com.ibm.training.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionalInterfaceDemo {
	
	
	public static <C> List<C> allMatches(List<C> inputList,MyCondition<C> condition){
		List<C> outputList = new ArrayList<>();
		for(C aValue : inputList) {
			if(condition.test(aValue)) {
				outputList.add(aValue);
			}
		}
		return outputList;
	}

	public static void main(String[] args) {
		String[] words = {"axis", "this","about", "is", "a", "bunch", "of", "strange", "words", "like", "xylophone","state" };
		List<String> wordList = Arrays.asList(words);
		
//		List<String> fourLetterWords = allMatches(wordList, new FourLetterCondition());
		
		List<String> fourLetterWords = allMatches(wordList, s -> s.length() == 4);
		System.out.println(fourLetterWords);
		
		List<String> smallWords = allMatches(wordList, s -> s.length() <= 3);
		System.out.println(smallWords);
		
		List<String> eWords = allMatches(wordList, s -> s.contains("e"));
		System.out.println(eWords);
		
		List<Integer> iList = List.of(12,42,23,45,56,71);
		
		List<Integer> evens = allMatches(iList, num -> num % 2 == 0);
		System.out.println(evens);
	}

}

//class FourLetterCondition implements MyCondition{
//	@Override
//	public boolean test(String aValue) {
//		return aValue.length() == 4;
//	}
//}