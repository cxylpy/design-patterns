package com.lonphy.observerpattern.example4;

import java.util.Observable;
import java.util.Observer;

public class WaterDepartment implements Observer{
	private Observable subject;
	private double waterVelocity;
	private double waterDischarge;
	public WaterDepartment(Observable subject) {
		this.subject = subject;
		subject.addObserver(this);
	}
	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WaterStation) {
			WaterStation ws = (WaterStation)subject;
			waterVelocity = ws.getWaterVelocity();
			waterDischarge = ws.getWaterDischarge();
			System.out.println("水的流速（米/秒):"+waterVelocity);
			System.out.println("流量（立方米/秒）:"+waterDischarge);
		}
	}
	
}
