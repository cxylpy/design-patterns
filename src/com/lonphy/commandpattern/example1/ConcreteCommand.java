package com.lonphy.commandpattern.example1;

public class ConcreteCommand implements Command{
	private CompanyArmy army; //接收者的引用

	public ConcreteCommand(CompanyArmy army) {
		super();
		this.army = army;
	}
	/**
	 * 封装请求
	 */
	@Override
	public void execute() {
		army.sneakAttack();
	}
	
}
