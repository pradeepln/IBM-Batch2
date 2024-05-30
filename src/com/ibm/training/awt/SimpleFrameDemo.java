package com.ibm.training.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SimpleFrameDemo {

	public static void main(String[] args) {
		Frame frame = new Frame("My AWT GUI App!!");
		frame.setSize(400, 600);
		frame.setLocation(400, 400);
		
		Panel panel = new Panel();
		
		
		Label label = new Label("Your Name");
		TextField tf = new TextField(20);
		Button btn = new Button("Click Me");
		
		TextField status = new TextField(20);
		status.setEditable(false);
		
		panel.add(label);
		panel.add(tf);
		panel.add(btn);
		panel.add(status);
		
		frame.add(panel, BorderLayout.CENTER);
		
		btn.addActionListener(e -> {
			String text = tf.getText();
			status.setText(text);
			tf.setText("");
		});
		
		
		//frame.addWindowListener(new MywindowCloser());
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("In Anon closer..bye!");
				System.exit(0);
			}
		});
		frame.setVisible(true);
	}

	

}

//class MyBtnHandler implements ActionListener{
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println(e);		
//	}
//	
//}

//class MywindowCloser extends WindowAdapter{
//	@Override
//	public void windowClosing(WindowEvent e) {
//		System.out.println("Bye!");
//		System.exit(0);
//	}
//}