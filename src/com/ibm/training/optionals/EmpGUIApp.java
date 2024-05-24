package com.ibm.training.optionals;

import java.util.Optional;

import com.ibm.training.basics.Employee;

public class EmpGUIApp {

	public static void main(String[] args) {
		EmployeeDBHelper helper = new EmployeeDBHelper();
		
		
		//read id from ui
		int id = 10;
		
		//classical 'defensive' way of using optional
//		Optional<Employee> opt = helper.findEmployeeFromDB(id);
//		
//		if (opt.isPresent()) {
//			Employee e = opt.get();
//			System.out.println("name " + e.getName());
//			System.out.println("sal " + e.getSalary());
//		}

		Employee defaultEmp = new Employee(0, "not found", 0);
		
		Employee e = helper.findEmployeeFromDB(id).orElse(defaultEmp);
		
		System.out.println("name " + e.getName());
		System.out.println("sal " + e.getSalary());
	}

}
