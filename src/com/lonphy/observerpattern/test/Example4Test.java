package com.lonphy.observerpattern.test;

import org.junit.Test;

import com.lonphy.observerpattern.example4.WaterDepartment;
import com.lonphy.observerpattern.example4.WaterStation;

public class Example4Test {
	@Test
	public void testMain(){
		WaterStation ws = new WaterStation();
		WaterDepartment wd = new WaterDepartment(ws);
		ws.giveMessage(10, 200.1);
		ws.giveMessage(15, 220.5);
		ws.giveMessage(5, 153);
	}
	
}
