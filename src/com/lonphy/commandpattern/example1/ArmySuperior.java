package com.lonphy.commandpattern.example1;

public class ArmySuperior {
	private Command command;

	public ArmySuperior(Command command) {
		super();
		this.command = command;
	}
	
	public void startExecuteCommand() {
		command.execute();
	}
	
}
