package com.ibm.training.collections;

import java.util.Comparator;

import com.ibm.training.basics.Employee;

public class EmployeeSalaryComparator implements Comparator<Employee> {
	
	public int compare(Employee e1, Employee e2) {
		if(e1.getSalary() > e2.getSalary()) {
			return 1;
		}else if(e2.getSalary() > e1.getSalary()) {
			return -1;
		}else {
			return 0;
		}
		
		//return (int) e1.getSalary() - e2.getSalary();
	}

}
