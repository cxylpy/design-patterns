package com.lonphy.commandpattern.example1;

public class ArmySuperior {
	private Command command;//存放具体命令的引用

	public ArmySuperior(Command command) {
		super();
		this.command = command;
	}
	
	public void startExecuteCommand() { //执行具体命令的方法
		command.execute();
	}
	
}
