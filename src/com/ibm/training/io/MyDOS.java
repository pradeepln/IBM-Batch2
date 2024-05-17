package com.ibm.training.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class MyDOS {

	public static void main(String[] args) throws IOException {
		
		String command = args[0];
		switch(command) {
		case "dir":
			performDir(args);
			break;
		case "copy":
			performCopy(args);
			break;
		case "type":
			performType(args);
			break;
		default:
			System.out.println("Unknown Command.");
		}

	}

	private static void performType(String[] args) throws IOException {
		if(args.length < 2) {
			System.out.println("Usage:\ntype <filename>");
		}
		
		try(BufferedReader in = new BufferedReader(new FileReader(args[1]))){
			
			String aLine;
			while((aLine = in.readLine()) != null) {
				System.out.println(aLine);
			}
		}
		
	}

	private static void performCopy(String[] args) throws IOException {
		long start = System.currentTimeMillis();
		
		if(args.length < 3) {
			System.out.println("Usage:\ncopy <srcFile> <destFile>");
			return;
		}
		
		File srcFile = new File(args[1]);
		File destFile = new File(args[2]);
		
		try (   BufferedInputStream in = new BufferedInputStream(new FileInputStream(srcFile));
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(destFile)) )
		{
			int aByte;
			while((aByte = in.read()) != -1) {
				out.write(aByte);
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Copying took "+(end - start)+" ms.");
	}

	private static void performDir(String[] args) {
		String dirPath = ".";
		if(args.length > 1) {
			dirPath = args[1];
		}
		
		File folder = new File(dirPath);
		if(folder.exists() && folder.isDirectory()) {
			String[] contents = folder.list();
			for(int i=0;i<contents.length;i++) {
				System.out.println(contents[i]);
			}
		}
	}

}
