package com.lonphy.mediatorpattern.example1;

public class ColleagueB implements Colleague{
	private String name;
	private ConcreteMediator mediator;
	
	public ColleagueB(ConcreteMediator mediator) {
		this.mediator = mediator;
		mediator.registerColleagueB(this);
	}

	@Override
	public void giveMsg(String[] msg) {
		mediator.deliverMsg(this, msg);
	}

	@Override
	public void receiveMsg(String msg) {
		System.out.println(name+"收到的信息：");
		System.out.println("\t"+msg);
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}
	
}
