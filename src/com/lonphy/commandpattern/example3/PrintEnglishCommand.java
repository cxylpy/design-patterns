package com.lonphy.commandpattern.example3;

public class PrintEnglishCommand implements Command{
	private PrintLetter letter;
	
	public PrintEnglishCommand(PrintLetter letter) {
		super();
		this.letter = letter;
	}

	@Override
	public void execute() {
		letter.printEnglish();
	}

}
