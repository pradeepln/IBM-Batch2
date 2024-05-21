package com.ibm.training.basics;

public class Employee {
	
	int id;
	String name = "TBD";
	protected float salary;
	
	public Employee(int id,String name,float salary) {
		super();
		System.out.println("--------- inside the 3 arg constructor ----------");
		this.id = id;
		this.name = name;
		this.salary = salary;
		// complex logic to decide which team is best fit for this emp
	}
	
	
	public Employee(int id,String name) {
		this(id,name,-1);
		System.out.println("--------- inside the 2 arg constructor ---------");
		
		
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}

