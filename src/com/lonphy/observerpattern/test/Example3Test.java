package com.lonphy.observerpattern.test;

import org.junit.Test;

import com.lonphy.observerpattern.example3.Person;
import com.lonphy.observerpattern.example3.TravelAgency;
import com.lonphy.observerpattern.example3.WeatherStation;

public class Example3Test {
	@Test
	public void testMain() {
		WeatherStation ws = new WeatherStation();
		TravelAgency ta = new TravelAgency();
		Person a = new Person(ws, ta);
		ws.doForecast("10日", "阴有小雨", 28, 20);
		ta.giveMess("10日", "黄山2日游");
		ws.doForecast("11日", "阴转多云", 30, 22);
		ta.giveMess("11日", "漓江1日游");
	}
}
