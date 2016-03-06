package com.lonphy.observerpattern.example2;

import java.util.ArrayList;

public class ShopSubject implements Subject{
	private String goodsName;
	private double oldPrice, newPrice;
	private ArrayList<Observer> customerList;
	public ShopSubject() {
		customerList = new ArrayList<>();
	}
	@Override
	public void addObserver(Observer o) {
		if(!customerList.contains(o))
			customerList.add(o);
	}

	@Override
	public void deleteObserver(Observer o) {
		if(customerList.contains(o)) 
			customerList.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(Observer o : customerList) {
			o.update();
		}
	}
	
	public void setDiscountGoods(String name, double oldP, double newP) {
		goodsName = name;
		oldPrice = oldP;
		newPrice = newP;
		notifyObservers();
	}
	
	public String getGoodsName() {
		return goodsName;
	}
	
	public double getOldPrice() {
		return oldPrice;
	}
	public double getNewPrice() {
		return newPrice;
	}

}
