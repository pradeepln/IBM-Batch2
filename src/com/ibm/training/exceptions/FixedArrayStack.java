package com.ibm.training.exceptions;
//								is-a
//								fulfills being
public class FixedArrayStack implements Stack {
	
	Object[] contents;
	int top = -1;

	public FixedArrayStack(int capacity) {
		contents = new Object[capacity];
	}
	
	@Override
	public void push(Object anElement) {
		if(top == contents.length - 1) {
			throw new StackFullException("The stack is full with capacity : "+contents.length);
		}
		contents[++top] = anElement;
	}
	
	@Override
	public Object pop() {
		if(top == -1) {
			throw new StackEmptyException("The stack seems empty!!");
		}
		return contents[top--];
	}
}
