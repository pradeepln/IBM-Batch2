package com.ibm.training.basics;

public class DOWFinder {
	
	public String findDOW(int day,int month,int year) {
		
		int numDays = 0; // this number of days elapsed since jan 1st 1900
		
		//numDays --------> daysSince1900TillDEc31LastYear + days since jan1st this year till last month end + days in current month
				
		numDays += (year - 1900) * 365;
		numDays += (year - 1900) / 4;
		
		if(year % 4 == 0 && month <= 2) {
			numDays--;
		}
		// --------- at this stage numdays has  daysSince1900TillDEc31LastYear
		
		switch(month) {
		case 12: numDays += 30; //we're adding days from previous month
		case 11: numDays += 31;
		case 10: numDays += 30;
		case 9: numDays += 31;
		case 8: numDays += 31;
		case 7: numDays += 30;
		case 6: numDays += 31;
		case 5: numDays += 30;
		case 4: numDays += 31;
		case 3: numDays += 28;
		case 2: numDays += 31;
		}
		
		// --------- at this stage numdays has  daysSince1900TillDEc31LastYear + days since jan1st this year till last month end
		
		numDays += day;
		// --- done adding days elapsed in current month
		
		int dowIndex = numDays % 7;
		String[] days = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		return days[dowIndex];
	}

	public static void main(String[] args) {
		//findDOW(9,5,2024);
		DOWFinder finder = new DOWFinder();
		String dow = finder.findDOW(9,5,2024);
		System.out.println(dow);

	}

}
