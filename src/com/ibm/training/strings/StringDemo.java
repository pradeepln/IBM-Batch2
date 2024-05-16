package com.ibm.training.strings;

import java.util.Arrays;

public class StringDemo {
	
	public static void main(String[] args) {
		//literalsAndObjects();
		//stringOps();
		String[] words = {"This","is","a","somewhat","broken","sentence"};
		String sentence = formSentence(words);
		System.out.println(sentence);
	}

	private static String formSentence(String[] words) {
		//String sentence = "";
		StringBuilder buf = new StringBuilder();
		for(int i = 0 ;i < words.length; i++) {
			buf.append(words[i]);
			buf.append(" ");
			//Do not do the following : heavy duty concat using + or concat is expensive
//			sentence = sentence.concat(words[i]+" ");
//			sentence = sentence+words[i]+" ";
//			sentence += words[i]+" ";
		}
		return buf.toString();
	}

	private static void stringOps() {
		String s1 = "hello java";
		
		//String s2 = s1.toUpperCase();
		String s2 = s1.toLowerCase();
		System.out.println(s2);
		System.out.println("s1 == s2 "+(s1 == s2));
		System.out.println("ello in s1? "+ (s1.contains("ello")));
		System.out.println("s1 begins with he? "+ (s1.startsWith("he")));
		System.out.println("at what pos o is in s1? "+ (s1.indexOf('o')));
		System.out.println("substring starting at 6 = "+s1.substring(6));
		
		String delim = "1;name;1234";
		String[] tokens = delim.split(";");
		System.out.println(Arrays.asList(tokens));
		
		String s = "     hello     ";
		System.out.println("s = "+s);
		System.out.println("trimmed s="+s.trim());
	}

	private static void literalsAndObjects() {
		
		String s1 = "hello";
		String s2 = "hello";
		
		String s3 = new String("hello");
		String s4 = new String("Hello");
		
		System.out.println("s1 == s2? "+(s1 == s2));
		System.out.println("s1 == s3? "+(s1 == s3));
		System.out.println("s3 == s4? "+(s3 == s4));
		
		System.out.println("________________________");
		
		System.out.println("s1 equals s2? "+(s1.equals(s2)));
		System.out.println("s1 equals s3? "+(s1.equals(s3)));
		System.out.println("s3 equals s4? "+(s3.equals(s4)));
		System.out.println("s3 equalsIgnoreCase s4? "+(s3.equalsIgnoreCase(s4)));
		
		String s5 = s1.concat(" world");
		System.out.println(s1);
		System.out.println(s5);
	}

}
