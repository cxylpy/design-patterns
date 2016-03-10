package com.lonphy.chainofresponsibilitypattern.example1;

import java.util.ArrayList;

public class ShangHai implements Handler{
	private ArrayList<String> numberList;
	private Handler handler;
	
	public ShangHai() {
		super();
		numberList = new ArrayList<>();
		numberList.add("45648979484984984984");
		numberList.add("54898711897123891103");
		numberList.add("11321328546516515616");
		numberList.add("17899841698156198411");
	}

	@Override
	public void handleRequest(String number) {
		if(numberList.contains(number)) System.out.println("该人在上海居住");
		else {
			System.out.println("该人不在上海居住");
			if(handler!=null) 
				handler.handleRequest(number);
		}
	}

	@Override
	public void setNextHandler(Handler handler) {
		this.handler = handler;
	}

}
