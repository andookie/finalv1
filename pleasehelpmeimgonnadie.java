package JFrames;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import javax.swing.*;
import java.io.*;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.text.SimpleDateFormat;
import java.util.Date;

public class pleasehelpmeimgonnadie {
	private JFrame ourFrame = new JFrame("Password Manager"); 
	
	pleasehelpmeimgonnadie(){
		ourFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ourFrame.setBounds(200, 100, 400, 300);
		
		Container container = ourFrame.getContentPane();
		container.setLayout(null);
		//JFrame logo
		JLabel logo = new JLabel("Enter Your Information Into the Boxes");
		logo.setBounds(110,5,250,30);
		
		//website label
		JLabel website_label = new JLabel("Website : ");
		website_label.setBounds(25, 30, 250, 30);
		//email label
		JLabel email_label = new JLabel("Email :");
		email_label.setBounds(40,60,250,30);
		//password label
		JLabel password_label = new JLabel("Password :");
		password_label.setBounds(20,90,250,30);
		//website textfield
		JTextField websiteText = new JTextField(30);
		websiteText.setBounds(90, 30, 250, 30);
		Border border2 = BorderFactory.createLineBorder(Color.BLACK);
		websiteText.setBorder(border2);
		//email textfield
		JTextField emailText = new JTextField(30);
		emailText.setBounds(90,61,250,30);
        Border border = BorderFactory.createLineBorder(Color.BLACK);
        emailText.setBorder(border);
        //password textfield
		JPasswordField passwordText = new JPasswordField(30);
		passwordText.setBounds(90, 92, 250, 30);
		 Border border1 = BorderFactory.createLineBorder(Color.BLACK);
	        passwordText.setBorder(border1);
	        
	        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	        String date =sdf.format(new Date());
	        
	  
	   
		//Save Password button
		JButton savePassword = new JButton("Save Password");
		savePassword.setBounds(110, 123, 190, 30);
		
		savePassword.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
				String string = emailText.getText();
		char[] passwordGetPassword = passwordText.getPassword();
		String string1 = websiteText.getText();
		String fileName = "emailsAndPasswords.txt";
		
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			FileWriter yeet;
			yeet = new FileWriter(fileName, true);
		writer = new BufferedWriter(yeet);
		writer.write("Website : " + string1);
		writer.close();
		
		} catch (FileNotFoundException q) {
			q.printStackTrace();
		} catch (IOException q) {
			q.printStackTrace();

		}
		
	    BufferedWriter writer1 = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
			FileWriter w;
			w = new FileWriter(fileName, true);
			writer1 = new BufferedWriter(w);
		writer1.write(" | Username : " + string + " | Password : ");
		writer1.close();
		
		} catch (FileNotFoundException elol) {
			elol.printStackTrace();
		} catch (IOException elol) {
			elol.printStackTrace();

		}
		
	    BufferedWriter writer2 = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
		FileWriter wasd;
		wasd = new FileWriter(fileName, true);
		writer2 = new BufferedWriter(wasd);
		writer2.write(passwordGetPassword);
		writer2.close();
		

				

		} catch (FileNotFoundException error) {
			error.printStackTrace();
		} catch (IOException error) {
			error.printStackTrace();
			}
		
		BufferedWriter writer3 = new BufferedWriter(new OutputStreamWriter(System.out));

		try {
		FileWriter wlol;
		wlol = new FileWriter(fileName, true);
		writer3 = new BufferedWriter(wlol);
		writer3.write(" | Date Added : " + date);
		writer3.newLine();
		writer3.close();
		

				

		} catch (FileNotFoundException error1) {
			error1.printStackTrace();
		} catch (IOException error1) {
			error1.printStackTrace();
			}



		System.out.println("Done!");
		  Component parentComponent = null;
		JOptionPane.showMessageDialog(parentComponent, "Password Saved!");
		
		if(emailText.getText().trim().isEmpty()){
			JOptionPane.showMessageDialog(parentComponent, "Cannot Have Email Box Empty!");
		}
		if(passwordText.getText().trim().isEmpty()){
			JOptionPane.showMessageDialog(parentComponent, "Cannot Have Password Box Empty!");
		}
		
		if(websiteText.getText().trim().isEmpty()){
			JOptionPane.showMessageDialog(parentComponent, "Cannot Have Website Box Empty!");
		}
			}});
		
		
		  
		
	
		ourFrame.setVisible(true); 
		container.add(websiteText);
		container.add(website_label);
		container.add(logo);
		container.add(password_label);
		container.add(email_label);
		container.add(passwordText);
		container.add(emailText);
		container.add(savePassword); 

	}
	
		
			

}
	
	

	
		
		
		
		
		
	   
		
		 
