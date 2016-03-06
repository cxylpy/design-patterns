package com.lonphy.commandpattern.example3;

public class PrintOddNumber implements Command {
	private PrintNumber number;
	
	public PrintOddNumber(PrintNumber number) {
		super();
		this.number = number;
	}

	@Override
	public void execute() {
		number.printOddNumber();
	}

}
