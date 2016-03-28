package com.lonphy.visitorpattern.example2;

public class FactoryVisitor implements Visitor{
	
	@Override
	public void visit(Man man) {
		if(man.getStature()>1.55&&man.getEyeSight()>0.8)
			System.out.println(man.getName()+"符合当工人标准");
		else
			System.out.println(man.getName()+"不符合当工人标准");
	}

	@Override
	public void visit(Woman woman) {
		if(woman.getStature()>1.45&&woman.getEyeSight()>0.8&&woman.getBloodSugar()>=50&&woman.getBloodSugar()<=100)
			System.out.println(woman.getName()+"符合当工人标准");
		else
			System.out.println(woman.getName()+"不符合当工人标准");
	}

}
