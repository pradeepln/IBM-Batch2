package com.ibm.training.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.ibm.training.basics.Employee;

public class SortDemo {

	public static void main(String[] args) {
		//sortStringArray();
		//sortStringList();
		//sortEmployeeArray();
		//sortEmployeeArrayBySalary();
		sortStringArrayByLength();
	}

	private static void sortEmployeeArrayBySalary() {
		Employee e1 = new Employee(7, "bond", 11223);
		Employee e2 = new Employee(1, "founder",822);
		Employee e3 = new Employee(4, "flounder",766);
				
		Employee[] emps = {e1,e2,e3};
		
		System.out.println(Arrays.asList(emps));
		Arrays.sort(emps,new EmployeeSalaryComparator());
		
		//Arrays.sort(emps,new StringLengthComparator());
		
		System.out.println(Arrays.asList(emps));
	}
	
	private static void sortEmployeeArray() {
		Employee e1 = new Employee(7, "bond", 11223);
		Employee e2 = new Employee(1, "founder",822);
		Employee e3 = new Employee(4, "flounder",766);
				
		Employee[] emps = {e1,e2,e3};
		
		System.out.println(Arrays.asList(emps));
		Arrays.sort(emps);
		System.out.println(Arrays.asList(emps));
	}

	private static void sortStringList() {

		String[] words = { "this", "is", "a", "bumch", "of", "strange", "words", "like", "xylophone" };
		List<String> wordList = Arrays.asList(words);
		System.out.println(wordList);
		Collections.sort(wordList);
		System.out.println(wordList);
	}

	private static void sortStringArray() {

		String[] words = { "this", "is", "a", "bumch", "of", "strange", "words", "like", "xylophone" };

		System.out.println(Arrays.asList(words));
		Arrays.sort(words);
		System.out.println(Arrays.asList(words));
	}

	private static void sortStringArrayByLength() {

		String[] words = { "this", "is", "a", "bumch", "of", "strange", "words", "like", "xylophone" };

		System.out.println(Arrays.asList(words));
		Arrays.sort(words,new StringLengthComparator());
		System.out.println(Arrays.asList(words));
	}
	
	private static void sortStringArrayByLengthUsingAnon() {

		String[] words = { "this", "is", "a", "bumch", "of", "strange", "words", "like", "xylophone" };

		System.out.println(Arrays.asList(words));
		
		Arrays.sort(words,new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		
		
		System.out.println(Arrays.asList(words));
	}
}
