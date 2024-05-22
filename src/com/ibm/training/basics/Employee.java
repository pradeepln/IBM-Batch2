package com.ibm.training.basics;

public class Employee implements Comparable<Employee>{
	
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
	
	@Override
	public int compareTo(Employee other) {
		//System.out.println("Employee"+this.id+" is being compared with Employee"+other.id);
		if(this.id > other.id) {
			return 1;
		}else if(other.id > this.id) {
			return -1;
		}else {
			return 0;
		}
		
		//return this.id - other.id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}

	
}

