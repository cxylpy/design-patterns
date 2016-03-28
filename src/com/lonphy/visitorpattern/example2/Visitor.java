package com.lonphy.visitorpattern.example2;

public interface Visitor {
	void visit(Man man);
	void visit(Woman woman);
}
