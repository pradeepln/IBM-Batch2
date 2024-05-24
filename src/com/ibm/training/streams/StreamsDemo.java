package com.ibm.training.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		String[] words = {"axis", "this","about", "is", "a", "bunch", "of", "strange", "words", "like", "xylophone","state" };

//		Stream
//			.of(words)
//			.forEach(s -> {
//				System.out.println(s);
//				System.out.println("_______");
//			});
//		
//		List<Double> dList=
//		Stream
//			.of(words)
//			.map(s -> s.length())
//			.map(num -> num * num)
//			.map(n -> Math.sin(n))
//			.toList();
//		
//		System.out.println(dList);
		
//		Stream
//		.of(words)
//		.filter(s -> s.length() >= 3)
//		.filter(s -> s.contains("e"))
//		.map(s -> s.toUpperCase())
//		.forEach(System.out::println);
		
		List<String> wordList = Arrays.asList(words);
		
		String sentence =
			wordList
			.stream()
			.map(s -> s.toUpperCase())
			.reduce("", (s1,s2) -> s1+" "+s2);
		
		System.out.println(sentence);
		//Stream.of
	}

}
