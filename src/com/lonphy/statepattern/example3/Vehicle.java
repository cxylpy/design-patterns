package com.lonphy.statepattern.example3;

public class Vehicle {
	private static State moveState,restState;
	private State state;
	private String name;
	public Vehicle(String name) {
		this.name = name;
		moveState = new MoveState();
		restState = new RestState();
		state = restState;
	}
	public void startUp() {
		state.startUp(this);
	}
	public void stop() {
		state.stop(this);
	}
	public static State getMoveState() {
		return moveState;
	}
	public static void setMoveState(State moveState) {
		Vehicle.moveState = moveState;
	}
	public static State getRestState() {
		return restState;
	}
	public static void setRestState(State restState) {
		Vehicle.restState = restState;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
