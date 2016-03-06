package com.lonphy.commandpattern.test;

import org.junit.Test;

import com.lonphy.commandpattern.example1.ArmySuperior;
import com.lonphy.commandpattern.example1.Command;
import com.lonphy.commandpattern.example1.CompanyArmy;
import com.lonphy.commandpattern.example1.ConcreteCommand;

public class Example1Test {
	@Test
	public void testMain() {
		CompanyArmy army = new CompanyArmy();
		Command command = new ConcreteCommand(army);
		ArmySuperior superiror = new ArmySuperior(command);
		superiror.startExecuteCommand();
	}
}
