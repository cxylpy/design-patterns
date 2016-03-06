package com.lonphy.commandpattern.example2;

public class RequestMakeDir {
	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	public void startExecuteCommand(String name) {
		command.execute(name);
	}
	public void undoCommand() {
		command.undo();
	}
}
