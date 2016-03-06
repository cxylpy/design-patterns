package com.lonphy.commandpattern.test;

import org.junit.Test;

import com.lonphy.commandpattern.example2.Command;
import com.lonphy.commandpattern.example2.ConcreteCommand;
import com.lonphy.commandpattern.example2.MakeDir;
import com.lonphy.commandpattern.example2.RequestMakeDir;

public class Example2Test {
	@Test
	public void testMain() {
		MakeDir makeDir = new MakeDir();
		Command command = new ConcreteCommand(makeDir);
		RequestMakeDir request = new RequestMakeDir();
		request.setCommand(command);
		request.startExecuteCommand("D:/aaa");
		request.startExecuteCommand("D:/bbb");
		request.startExecuteCommand("D:/ccc");
		request.startExecuteCommand("D:/ddd");
		request.undoCommand();
		request.undoCommand();
		request.undoCommand();
		request.undoCommand();
		request.undoCommand();
	}
}
