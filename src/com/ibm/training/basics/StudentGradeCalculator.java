package com.ibm.training.basics;

public class StudentGradeCalculator {

	public static void main(String[] args) {
		StudentGradeCalculator sgc = new StudentGradeCalculator();
		System.out.println(sgc.getGrade(65));
		System.out.println(sgc.getGrade(55));
		System.out.println(sgc.getGrade(45));
		System.out.println(sgc.getGrade(35));
		System.out.println(sgc.getGrade(25));
		
		float marks = 81.5f;
		String grade = sgc.getGrade(marks);
		
		switch(grade) {
		case "first" :
			System.out.println("You get award of 10000");
			break;
		case "second" :
			System.out.println("You get 5000");
			break;
		case "pass" :
			System.out.println("You get 3000");
			break;
			default:
				System.out.println("Better luck next time");
		}
	}

	public String getGrade(float marks) {
		if(marks < 35) {
			return "fail";
		}else if(marks >= 35 && marks < 50) {
			return "pass";
		}else if(marks >= 50 && marks < 60) {
			return "second";
		}else {
			return "first";
		}
	}
}
