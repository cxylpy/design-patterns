package com.lonphy.statepattern.example3;

public class MoveState extends State{

	@Override
	public void startUp(Vehicle vehicle) {
		System.out.println(vehicle.getName()+"已经在运动状态了");
	}

	@Override
	public void stop(Vehicle vehicle) {
		System.out.println(vehicle.getName()+"停止运动");
		vehicle.setState(Vehicle.getRestState());
	}

}
