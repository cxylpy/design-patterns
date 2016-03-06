package com.lonphy.observerpattern.example4;

import java.util.Observable;

public class WaterStation extends Observable{
	private double waterVelocity;
	private double waterDischarge;
	public void giveMessage(double waterVelocity,double waterDischarge) {
		if(this.waterVelocity!=waterVelocity||this.waterDischarge!=waterDischarge) setChanged();
		this.waterDischarge = waterDischarge;
		this.waterVelocity = waterVelocity;
		notifyObservers();
	}
	public double getWaterVelocity() {
		return waterVelocity;
	}
	public double getWaterDischarge() {
		return waterDischarge;
	}
	
}
