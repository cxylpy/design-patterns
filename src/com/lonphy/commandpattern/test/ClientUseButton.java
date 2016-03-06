package com.lonphy.commandpattern.test;

import java.awt.FlowLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.lonphy.commandpattern.example4.Command;
import com.lonphy.commandpattern.example4.Invoke;
import com.lonphy.commandpattern.example4.MultiCommand;
import com.lonphy.commandpattern.example4.ShowMultForm;

public class ClientUseButton extends JFrame{
	JButton button;
	Command command;
	Invoke person;
	public ClientUseButton() throws HeadlessException {
		super();
		person = new Invoke();
		ShowMultForm showMultForm = new ShowMultForm();
		command = new MultiCommand(showMultForm);
		person.setCommand(command);
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout());
		button = person.getButton();
		frame.add(button);
		frame.setSize(200,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		ClientUseButton win = new ClientUseButton();
	}
	
}
