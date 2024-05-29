package com.ibm.training.io.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeEmployee {

	public static void main(String[] args) throws Exception {
		Employee e = new Employee(7, "Games Pond", 1234f);
		
		FileOutputStream fos = new FileOutputStream("employee.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(e);
		
		oos.flush();
	}

}
