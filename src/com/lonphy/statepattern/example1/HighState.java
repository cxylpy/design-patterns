package com.lonphy.statepattern.example1;

public class HighState implements TemperatureState{
	private double n = 39;
	public HighState(double n) {
		if(n>=39)this.n = n;
	}
	@Override
	public void showTemperature() {
		System.out.println("现在的温度是"+n+"属于高温度");
	}

}
