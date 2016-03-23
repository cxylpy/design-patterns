package com.lonphy.statepattern.example1;

public class Thermometer {
	private TemperatureState state;
	public void showMsg() {
		System.out.println("*******************");
		state.showTemperature();
		System.out.println("*******************");
	}
	public TemperatureState getState() {
		return state;
	}
	public void setState(TemperatureState state) {
		this.state = state;
	}
	
}
