package com.lonphy.commandpattern.example3;

import java.util.ArrayList;

public class MacroCommand implements Command {
	private ArrayList<Command> commandList;
	
	public MacroCommand(ArrayList<Command> commandList) {
		super();
		this.commandList = commandList;
	}
	
	@Override
	public void execute() {
		for(Command c : commandList) {
			c.execute();
		}
	}

}
