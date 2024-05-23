package com.ibm.training.lambdas;

import java.util.Arrays;

public class LambdaDemo {

//arity           ret                   arglist
//sig accS  modi  ret      name         arglist
	public static int wordsWithEFirst(String word1,String word2){
		if(word1.contains("e") && !word2.contains("e")) {
			return -1;
		}else if(word2.contains("e") && !word1.contains("e")) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		String[] words = {"axis", "this","about", "is", "a", "bunch", "of", "strange", "words", "like", "xylophone","state" };
		
		System.out.println(Arrays.asList(words));
		
		//Arrays.sort(words,(s1,s2) -> s1.length() - s2.length() );
		//Arrays.sort(words,(s1,s2) -> s2.length() - s1.length() );
		
		//Arrays.sort(words,(s1,s2) -> s1.charAt(0) - s2.charAt(0));
		
		//Arrays.sort(words,(s1,s2) -> s1.substring(0,1).compareTo(s2.substring(0,1)));
		
		
//		Arrays.sort(words, (s1,s2) -> {
//			
//			if(s1.contains("e") && !s2.contains("e")) {
//				return -1;
//			}else if(s2.contains("e") && !s1.contains("e")) {
//				return 1;
//			}else {
//				return 0;
//			}
//		});
		
		
//		Arrays.sort(words, (s1,s2) -> wordsWithEFirst(s1, s2));
		
		Arrays.sort(words, LambdaDemo::wordsWithEFirst);
		
		System.out.println(Arrays.asList(words));
	}

}
