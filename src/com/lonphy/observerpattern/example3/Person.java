package com.lonphy.observerpattern.example3;

public class Person implements Observer{
	private Subject subjectOne,subjectTwo;
	private String forecastTime,forecastMess;
	private String tourStartTime,tourMess;
	private int maxTemperature,minTemperature;
	
	public Person(Subject subjectOne, Subject subjectTwo) {
		this.subjectOne = subjectOne;
		this.subjectTwo = subjectTwo;
		subjectOne.addObserver(this);
		subjectTwo.addObserver(this);
	}

	@Override
	public void update(Subject subject) {
		if(subject instanceof WeatherStation) {
			WeatherStation ws = (WeatherStation)subject;
			forecastTime = ws.getForecastTime();
			forecastMess = ws.getForecastMess();
			maxTemperature = ws.getMaxTemperature();
			minTemperature = ws.getMaxTemperature();
			System.out.println("预报日期："+forecastTime+",天气情况:"+forecastMess+"，最高温度："+maxTemperature+",最低温度:"+minTemperature);
		}else if(subject instanceof TravelAgency) {
			TravelAgency ta = (TravelAgency)subject;
			tourStartTime = ta.getTourStartTime();
			tourMess = ta.getTourMess();
			System.out.println("旅游开始日期："+tourStartTime+"，旅游信息："+tourMess);
		}
	}

}
