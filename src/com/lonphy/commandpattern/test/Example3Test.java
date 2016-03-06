package com.lonphy.commandpattern.test;

import java.util.ArrayList;

import org.junit.Test;

import com.lonphy.commandpattern.example3.Command;
import com.lonphy.commandpattern.example3.MacroCommand;
import com.lonphy.commandpattern.example3.PrintEnglishCommand;
import com.lonphy.commandpattern.example3.PrintEvenNumberCommand;
import com.lonphy.commandpattern.example3.PrintLetter;
import com.lonphy.commandpattern.example3.PrintNumber;
import com.lonphy.commandpattern.example3.PrintOddNumber;
import com.lonphy.commandpattern.example3.RequestPerson;

public class Example3Test {
	@Test
	public void testMain() {
		PrintLetter letter = new PrintLetter();
		PrintNumber number = new PrintNumber(20);

		Command c1 = new PrintEnglishCommand(letter);
		Command c2 = new PrintEvenNumberCommand(number);
		Command c3 = new PrintOddNumber(number);
		ArrayList<Command> commandList = new ArrayList<>();
		commandList.add(c1);
		commandList.add(c2);
		commandList.add(c3);
		MacroCommand mc = new MacroCommand(commandList);
		RequestPerson person = new RequestPerson();
		System.out.println("单独输出英文字母表:");
		person.setCommand(c1);
		person.startExecuteCommand();
		System.out.println("用一个宏命令输出英文字母表，偶数和奇数:");
		person.setCommand(mc);
		person.startExecuteCommand();
	}
}
