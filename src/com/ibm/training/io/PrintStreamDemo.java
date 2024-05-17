package com.ibm.training.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("D:\\temp\\MayB2\\printedfile.txt");
		
		PrintStream out = new PrintStream(fout);
		
		out.println("Hello this is first line?");
		out.println("second line");
		out.print("third line begin ");
		out.print(42);
		out.print(" "+34.3);
		out.println();
		out.flush();
	}

}
