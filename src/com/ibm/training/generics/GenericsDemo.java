package com.ibm.training.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {

	
	public static <T> T pickBestFrom(List<T> l) {
	//some complex logic not shown here
		return l.get(0);
	}
	
	
	public static void main(String[] args) {
		useGenericType();

		List<String> sList = new ArrayList<>();
		sList.add("abc");sList.add("xyz");
		
		List<Integer> iList = new ArrayList<>();
		iList.add(1233);iList.add(782);
		
		String bestWord = pickBestFrom(sList);
		Integer bestNum =  pickBestFrom(iList);
		
		//Double bestD = (Double) pickBestFrom(sList);
	}

	private static void useGenericType() {
		Stack<String> sStack = new FixedArrayStack<String>(10);
		
		sStack.push("ababa");
		sStack.push("cccc");
		//sStack.push(1234);
		
		//Integer i = (Integer) sStack.pop();
		String aSt =  sStack.pop();
		
		
		Stack<Integer> iStack = new FixedArrayStack<>(12);
		iStack.push(121);
		//iStack.push("jdf");
		
		Integer i = iStack.pop();
	}

}
