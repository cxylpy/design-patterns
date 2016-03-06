package com.lonphy.commandpattern.example4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Invoke {
	JButton button;
	Command command;
	public Invoke() {
		button = new JButton();
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				executeCommand();
			}

		});
	}
	
	public JButton getButton() {
		return button;
	}

	public void setCommand(Command command) {
		this.command = command;
		button.setText(command.getName());
	}

	private void executeCommand() {
		command.execute();
	}
}
