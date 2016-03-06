package com.lonphy.observerpattern.example3;

import java.util.ArrayList;

public class TravelAgency implements Subject{
	private String tourStartTime;
	private String tourMess;
	private ArrayList<Observer> personList;
	public TravelAgency() {
		personList = new ArrayList<>();
	}
	@Override
	public void addObserver(Observer o) {
		if(o==null)return;
		if(!personList.contains(o))personList.add(o);
	}

	@Override
	public void deleteObserver(Observer o) {
		if(o==null)return;
		if(personList.contains(o))personList.remove(o);
	}

	@Override
	public void notifyObservers() {
		for(Observer o : personList) {
			o.update(this);
		}
	}

	public void giveMess(String time,String mess) {
		tourStartTime = time;
		tourMess = mess;
		notifyObservers();
	}
	public String getTourStartTime() {
		return tourStartTime;
	}
	public String getTourMess() {
		return tourMess;
	}
	
	
}
