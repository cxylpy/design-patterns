package com.lonphy.statepattern.example3;

public abstract class State {
	public abstract void startUp(Vehicle vehicle);
	public abstract void stop(Vehicle vehicle);
}
