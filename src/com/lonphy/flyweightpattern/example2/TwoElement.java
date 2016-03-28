package com.lonphy.flyweightpattern.example2;

public class TwoElement implements Element{
	private char elementOne,elementTwo;
	
	public TwoElement(char elementOne, char elementTwo) {
		this.elementOne = elementOne;
		this.elementTwo = elementTwo;
	}

	@Override
	public void printMsg(String name, int elementNumber1, int elementNumber2) {
		System.out.print(name+"由"+elementOne+"和"+elementTwo+"组成");
		System.out.println(" 含有"+elementNumber1+"个"+elementOne+"元素和"+elementNumber2+"个"+elementTwo+"元素");
	}

}
