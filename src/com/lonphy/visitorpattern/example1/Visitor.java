package com.lonphy.visitorpattern.example1;

public interface Visitor {
	void visit(Undergraduate stu);
	void visit(GraduateStudent stu);
}
