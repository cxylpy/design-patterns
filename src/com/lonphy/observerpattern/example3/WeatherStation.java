package com.lonphy.observerpattern.example3;

import java.util.ArrayList;

public class WeatherStation implements Subject {
	private String forecastTime,forecastMess;
	private int maxTemperature,minTemperature;
	private ArrayList<Observer> personList;
	public WeatherStation() {
		personList = new ArrayList<>();
	}
	@Override
	public void addObserver(Observer o) {
		if(o==null)return;
		if(!personList.contains(o))personList.add(o);
	}
	@Override
	public void deleteObserver(Observer o) {
		if(personList.contains(o))
			personList.remove(o);
	}
	@Override
	public void notifyObservers() {
		for(Observer o : personList) {
			o.update(this);
		}
	}

	public void doForecast(String t, String mess, int max, int min) {
		forecastTime = t;
		forecastMess =mess;
		maxTemperature = max;
		minTemperature = min;
		notifyObservers();
	}
	public String getForecastTime() {
		return forecastTime;
	}
	public String getForecastMess() {
		return forecastMess;
	}
	public int getMaxTemperature() {
		return maxTemperature;
	}
	public int getMinTemperature() {
		return minTemperature;
	}
	
}
