package com.ibm.training.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class SimpleDateOps {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		System.out.println("Today: ");
		printDate(today);
		
		int day = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		
		LocalDate birthDay = LocalDate.of(year, month, day);
		
		System.out.println("Your BirthDay: ");
		printDate(birthDay);
		
		LocalDate yesterday = today.minusDays(1);
		System.out.println("Yesterday:");
		printDate(yesterday);
		
		LocalDate tomorrow = today.plusDays(1);
		System.out.println("Tomorrow:");
		printDate(tomorrow);
		
		LocalDate thisDayLastYear = today.minusYears(1);
		System.out.println("thisDayLastYear:");
		printDate(thisDayLastYear);
		
		LocalDate resultDay = LocalDate.of(2024, Month.JUNE,4);
		System.out.println("Result on: ");
		printDate(resultDay);
		
		LocalTime timeNow = LocalTime.now();
		System.out.println(timeNow);
		LocalDateTime dateTimeNow = LocalDateTime.now();
		System.out.println(dateTimeNow);
	}

	private static void printDate(LocalDate aDate) {
		System.out.println(aDate);
		System.out.println("Day of year "+aDate.getDayOfYear());
		System.out.println("Day of month "+aDate.getDayOfMonth());
		System.out.println("Day of week "+aDate.getDayOfWeek().name());
		System.out.println("Month "+aDate.getMonth().name());
		System.out.println("Year "+aDate.getYear());
		System.out.println("_______________");
	}

}
