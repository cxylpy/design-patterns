package com.lonphy.prototypepattern.test;

import org.junit.Test;

import com.lonphy.prototypepattern.example3.Cubic;
import com.lonphy.prototypepattern.example3.Goat;

public class Example3Test {
	@Test
	public void testMain() throws CloneNotSupportedException {
		Cubic cubic = new Cubic(12,20,66);
		System.out.println("cubic的长、宽和高："+cubic.getLength()+","+cubic.getWidth()+","+cubic.getHeight());
		Cubic cubicCopy = (Cubic) cubic.cloneMe();
		System.out.println("cubicCopy的长、宽和高："+cubicCopy.getLength()+","+cubicCopy.getWidth()+","+cubicCopy.getHeight());
		Goat goat = new Goat();
		goat.setColor(new StringBuffer("白颜色的山羊"));
		System.out.println("goat是"+goat.getColor());
		Goat goatCopy = (Goat) goat.cloneMe();
		System.out.println("goatCopy是"+goatCopy.getColor());
		System.out.println("goatCopy将自己的颜色变为黑色");
		goatCopy.setColor(new StringBuffer("黑颜色的山羊"));
		System.out.println("goat是"+goat.getColor());
		System.out.println("goatCopy是"+goatCopy.getColor());
	}
}
