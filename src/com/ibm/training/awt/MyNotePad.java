package com.ibm.training.awt;

import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MyNotePad extends Frame implements ActionListener {

	String absolutePathToFile;
	
	MenuBar mBar = new MenuBar();
	Menu fileMenu = new Menu("File");
	MenuItem newItem = new MenuItem("New");
	MenuItem openItem = new MenuItem("Open");
	MenuItem saveItem = new MenuItem("Save");
	MenuItem exitItem = new MenuItem("Exit");
	
	TextArea textArea = new TextArea();
	
	MyNotePad(){
		super("My Own Notepad!!");
		this.setSize(300, 400);
		this.setLocation(350, 350);
		
		fileMenu.add(newItem);
		fileMenu.add(openItem);
		fileMenu.add(saveItem);
		fileMenu.add(exitItem);
		mBar.add(fileMenu);
		this.setMenuBar(mBar);
	
		this.add(textArea);
		
		this.setVisible(true);
		
		fileMenu.addActionListener(this);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new MyNotePad();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String actionCommand = e.getActionCommand();
		
		switch(actionCommand) {
		case "Open":
			doOpen();
			break;
		case "Save":
			doSave();
			break;
		}
		
			
		
			
		
	}

	private void doSave() {
		if(absolutePathToFile == null) {
			
			FileDialog fd = new FileDialog(this, "Specify Save", FileDialog.SAVE);
			fd.setVisible(true);
			absolutePathToFile = fd.getDirectory()+fd.getFile();
		}
		
		String text = textArea.getText();
		
		try(BufferedWriter out = new BufferedWriter(new FileWriter(absolutePathToFile));) {
			out.write(text);
			out.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void doOpen() {
		System.out.println("opening");
		FileDialog fd = new FileDialog(this, "Select File to Open", FileDialog.LOAD);
		fd.setVisible(true);
		String directory = fd.getDirectory();
		String file = fd.getFile();
		absolutePathToFile = directory+file;
		
		textArea.setText("");
		
		String line;
		
		try(BufferedReader in = new BufferedReader(new FileReader(absolutePathToFile));) {
			
			while ((line = in.readLine()) != null) {
				textArea.append(line + "\n");
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
