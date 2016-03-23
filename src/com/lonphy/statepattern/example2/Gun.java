package com.lonphy.statepattern.example2;

public class Gun {
	private State stateThree,stateTwo,stateOne,stateNull,state;
	public Gun() {
		stateThree = new BulletStateThree(this);
		stateTwo = new BulletStateTwo(this);
		stateOne = new BulletStateOne(this);
		stateNull = new BulletStateNull(this);
		state = stateThree;
	}
	public void fire() {
		state.fire();
	}
	public void loadBullet() {
		state.loadBullet();
	}
	public void setState(State state) {
		this.state = state;
	}
	public State getStateThree() {
		return stateThree;
	}
	public State getStateTwo() {
		return stateTwo;
	}
	public State getStateOne() {
		return stateOne;
	}
	public State getStateNull() {
		return stateNull;
	}
	
}
