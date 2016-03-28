package com.lonphy.visitorpattern.example1;

public class Company implements Visitor{

	@Override
	public void visit(Undergraduate stu) {
		if(stu.getMath()>80&&stu.getEnglish()>90)System.out.println(stu.getName()+"被录用");
	}

	@Override
	public void visit(GraduateStudent stu) {
		if(stu.getMath()>80&&stu.getEnglish()>90&&stu.getPhysics()>70)System.out.println(stu.getName()+"被录用");
	}

}
