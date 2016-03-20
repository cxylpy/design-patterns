package com.lonphy.prototypepattern.test;

import org.junit.Test;

import com.lonphy.prototypepattern.example1.Circle;

public class Example1Test {
	@Test
	public void testMain() {
		Circle c = new Circle();
		c.setRadius(186.123);
		try {
			Circle copy = (Circle)c.clone();
			System.out.println("circle对象中的数据："+c.getRadius());
			System.out.println("circle克隆对象中的数据："+copy.getRadius());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
