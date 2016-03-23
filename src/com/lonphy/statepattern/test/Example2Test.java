package com.lonphy.statepattern.test;

import org.junit.Test;

import com.lonphy.statepattern.example2.Gun;

public class Example2Test {
	@Test
	public void testMain() {
		Gun gun = new Gun();
		gun.fire();
		gun.fire();
		gun.fire();
		gun.fire();
		gun.loadBullet();
		gun.fire();
		
	}
}
