package com.lonphy.commandpattern.example3;

public class PrintEvenNumberCommand implements Command {
	private PrintNumber number;
	
	public PrintEvenNumberCommand(PrintNumber number) {
		super();
		this.number = number;
	}

	@Override
	public void execute() {
		number.printEvenNumber();
	}

}
