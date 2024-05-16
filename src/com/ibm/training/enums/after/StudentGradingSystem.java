package com.ibm.training.enums.after;

public class StudentGradingSystem {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		assignGrade(s1,83);
		assignGrade(s2,65);
		
		
	}

	private static void assignGrade(Student s, int marks) {
		if(marks >= 90) {
//			s.setGrade('a');
//			s.setGrade('A');
//			s.setGrade('%');
//			s.setGrade('Z');
			
			s.setGrade(Grade.GRADE_A);
		}
		
	}

}
