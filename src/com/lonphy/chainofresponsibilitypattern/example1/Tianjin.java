package com.lonphy.chainofresponsibilitypattern.example1;

import java.util.ArrayList;

public class Tianjin implements Handler{
	private Handler handler;
	private ArrayList<String> numberList;
	
	public Tianjin() {
		super();
		numberList = new ArrayList<>();
		numberList.add("12345698189411098");
		numberList.add("21564981894984189");
		numberList.add("35618908919981985");
		numberList.add("78949498984981231");
	}

	@Override
	public void handleRequest(String number) {
		if(numberList.contains(number))System.out.println("该人在天津居住");
		else {
			System.out.println("该人不在天津居住");
			if(handler!=null) 
				handler.handleRequest(number);
		}
	}

	@Override
	public void setNextHandler(Handler handler) {
		this.handler = handler;
	}
	
}
