package com.lonphy.observerpattern.example2;

public interface Subject {
	public void addObserver(Observer o);
	public void deleteObserver(Observer o);
	public void notifyObservers();
}
