package com.lonphy.flyweightpattern.example2;

public class Compound {
	private Element element;
	private String name;
	private int number1, number2;
	public Compound(Element element, String name, int number1, int number2) {
		this.element = element;
		this.name = name;
		this.number1 = number1;
		this.number2 = number2;
	}
	public void printMsg() {
		element.printMsg(name, number1, number2);
	}
}
