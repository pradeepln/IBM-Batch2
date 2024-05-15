package com.ibm.training.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		m1();

	}

	private static void m1() {
		m2();		
	}

	private static void m2() {
		try {
			m3();
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Class of exc obj is "+e.getClass().getName());
			System.out.println("Message inside the exc is : "+e.getMessage());
			e.printStackTrace();
		}
	}

	private static void m3() {
		int[] nums = {34,35,76,73,17};
		
		for(int i = 0; i <= nums.length ; i++) {
			try {
				int res = nums[i] / i;
				System.out.println("Value at index "+i+" is "+nums[i]);
				System.out.println("Finished index "+i);
			}catch (ArithmeticException e) {
				System.out.println("Class of exc obj is "+e.getClass().getName());
				System.out.println("Message inside the exc is : "+e.getMessage());
				continue;
			}
		}
	}

}
