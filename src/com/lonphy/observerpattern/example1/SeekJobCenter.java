package com.lonphy.observerpattern.example1;

import java.util.ArrayList;

public class SeekJobCenter implements Subject {
	private String message;
	private boolean changed;
	private ArrayList<Observer> personList; //存放观察者引用的集合

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
			for (Observer o : personList) { //通知所有观察者
				o.hearTelephone(message);
			}
			changed = false;
		}
	}
	
	public void giveNewMessage(String str) {
		if(str.equals(message)) { //如果信息相同就不通知
			changed = false;
		} else {
			message = str;
			changed = true;
		}
	}

}
