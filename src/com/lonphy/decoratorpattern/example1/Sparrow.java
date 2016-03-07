package com.lonphy.decoratorpattern.example1;

public class Sparrow extends Bird{
	public final int DISTANCE = 100;
	@Override
	public int fly() {
		return DISTANCE;
	}

}
