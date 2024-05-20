package com.ibm.training.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your birthday (dd/MM/yyyy): ");
		String input = kb.nextLine();
		//System.out.println("input = "+input);
		LocalDate birthday = LocalDate.parse(input,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		//System.out.println(birthday.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalDate today = LocalDate.now();
		
		Period period = Period.between(birthday, today.plusDays(1));
		System.out.println("You are "+period.getYears()+" years, "+period.getMonths()+" months and "+period.getDays()+" days old!");
		
	}

}
