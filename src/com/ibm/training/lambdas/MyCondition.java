package com.ibm.training.lambdas;

@FunctionalInterface
public interface MyCondition<T> {
	
	public boolean test(T aValue);
	
	public default void some() {
		System.out.println("jdfkj");
	}

}
