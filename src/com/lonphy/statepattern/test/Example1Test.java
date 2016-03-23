package com.lonphy.statepattern.test;

import org.junit.Test;

import com.lonphy.statepattern.example1.HighState;
import com.lonphy.statepattern.example1.LowState;
import com.lonphy.statepattern.example1.MiddleState;
import com.lonphy.statepattern.example1.TemperatureState;
import com.lonphy.statepattern.example1.Thermometer;

public class Example1Test {
	@Test
	public void testMain() {
		TemperatureState state = new LowState(-12);
		Thermometer thermometer = new Thermometer();
		thermometer.setState(state);
		thermometer.showMsg();
		state = new MiddleState(20);
		thermometer.setState(state);
		thermometer.showMsg();
		state = new HighState(39);
		thermometer.setState(state);
		thermometer.showMsg();
	}
}
