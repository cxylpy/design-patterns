package com.lonphy.statepattern.example1;

public class MiddleState implements TemperatureState{
	private double n = 15;
	public MiddleState(double n) {
		if(n>0&&n<26)this.n = n;
	}
	@Override
	public void showTemperature() {
		System.out.println("现在温度是"+n+"，属于正常温度");
	}

}
