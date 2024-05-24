package com.ibm.training.optionals;

import java.util.Optional;

import com.ibm.training.basics.Employee;

public class EmployeeDBHelper {
	
	public Optional<Employee> findEmployeeFromDB(int id) {
		//query a db ---- select * from employee emp_id=?
		boolean found = false;
		
		if(found) {
			return Optional.of(new Employee(id, "name from db"));
		}else {
			return Optional.empty();
		}
	}

}
