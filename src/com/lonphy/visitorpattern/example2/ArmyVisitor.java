package com.lonphy.visitorpattern.example2;

public class ArmyVisitor implements Visitor{

	@Override
	public void visit(Man man) {
		if(man.getStature()>1.72&&man.getEyeSight()>1.2)System.out.println(man.getName()+"符合当兵标准");
		else
			System.out.println(man.getName()+"不符合当兵标准");
	}

	@Override
	public void visit(Woman woman) {
		if(woman.getStature()>1.65&&woman.getEyeSight()>1.2&&woman.getBloodSugar()>=60&&woman.getBloodSugar()<=80)
			System.out.println(woman.getName()+"符合当兵标准");
		else
			System.out.println(woman.getName()+"不符合当兵标准");
	}

}
