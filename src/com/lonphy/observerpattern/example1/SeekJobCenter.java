package com.lonphy.observerpattern.example1;

import java.util.ArrayList;

public class SeekJobCenter implements Subject {
	private String message;
	private boolean changed;
	private ArrayList<Observer> personList;

	public SeekJobCenter() {
		super();
		personList = new ArrayList<>();
		message = "";
		changed = false;
	}

	@Override
	public void addObserver(Observer o) {
		if (!personList.contains(o))
			personList.add(o);
	}

	@Override
	public void deleteObserver(Observer o) {
		if (personList.contains(o))
			personList.remove(o);
	}

	@Override
	public void notifyObservers() {
		if (changed) {
			for (Observer o : personList) {
				o.hearTelephone(message);
			}
			changed = false;
		}
	}
	
	public void giveNewMessage(String str) {
		if(str.equals(message)) {
			changed = false;
		} else {
			message = str;
			changed = true;
		}
	}

}
