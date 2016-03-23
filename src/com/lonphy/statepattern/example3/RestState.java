package com.lonphy.statepattern.example3;

public class RestState extends State{

	@Override
	public void startUp(Vehicle vehicle) {
		System.out.println(vehicle.getName()+"开始运动");
		vehicle.setState(Vehicle.getMoveState());
	}

	@Override
	public void stop(Vehicle vehicle) {
		System.out.println(vehicle.getName()+"已经是静止状态了");
	}

}
