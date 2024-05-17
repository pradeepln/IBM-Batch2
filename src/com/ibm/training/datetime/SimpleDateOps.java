package com.ibm.training.datetime;

import java.time.LocalDate;

public class SimpleDateOps {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		System.out.println("Today: ");
		System.out.println("Day of year "+today.getDayOfYear());
		System.out.println("Day of month "+today.getDayOfMonth());
		System.out.println("Day of week "+today.getDayOfWeek().name());
		System.out.println("Month "+today.getMonth().name());
		System.out.println("Year "+today.getYear());
		System.out.println("_______________");
		
		int day = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		
		LocalDate birthDay = LocalDate.of(year, month, day);
		
		System.out.println("Your BirthDay: ");
		System.out.println("Day of year "+birthDay.getDayOfYear());
		System.out.println("Day of month "+birthDay.getDayOfMonth());
		System.out.println("Day of week "+birthDay.getDayOfWeek().name());
		System.out.println("Month "+birthDay.getMonth().name());
		System.out.println("Year "+birthDay.getYear());
		System.out.println("_______________");
	}

}
