package com.lonphy.commandpattern.example3;

public class RequestPerson {
	Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	public void startExecuteCommand() {
		command.execute();
	}
}
