package com.lonphy.commandpattern.example1;

public class ConcreteCommand implements Command{
	CompanyArmy army;

	public ConcreteCommand(CompanyArmy army) {
		super();
		this.army = army;
	}

	@Override
	public void execute() {
		army.sneakAttack();
	}
	
}
