package com.lonphy.chainofresponsibilitypattern.example1;

import java.util.ArrayList;

public class Beijing implements Handler{
	private Handler handler;
	private ArrayList<String> numberList;
	
	public Beijing() {
		super();
		numberList = new ArrayList<>();
		numberList.add("11158498115989189");
		numberList.add("89744981891198198");
		numberList.add("78456498112318415");
		numberList.add("31654981198980981");
	}

	@Override
	public void handleRequest(String number) {
		if(numberList.contains(number)) {
			System.out.println("该人在北京居住");
		} else {
			System.out.println("该人不在北京居住");
			if(handler!=null) {
				handler.handleRequest(number);
			}
		}
	}

	@Override
	public void setNextHandler(Handler handler) {
		this.handler = handler;
	}

}
