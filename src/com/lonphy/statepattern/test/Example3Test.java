package com.lonphy.statepattern.test;

import org.junit.Test;

import com.lonphy.statepattern.example3.Vehicle;

public class Example3Test {
	@Test
	public void testMain() {
		Vehicle v1 = new Vehicle("卧铺车厢");
		Vehicle v2 = new Vehicle("普通车厢");
		v1.startUp();
		v2.startUp();
		v1.stop();
		v2.stop();
	}
}
