package com.lonphy.statepattern.example1;

public class LowState implements TemperatureState{
	private double n = 0;
	public LowState(double n) {
		if(n<=0) this.n = n;
	}
	@Override
	public void showTemperature() {
		System.out.println("现在温度是"+n+"，属于低温度");
	}

}
