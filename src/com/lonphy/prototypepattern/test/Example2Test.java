package com.lonphy.prototypepattern.test;

import org.junit.Test;

import com.lonphy.prototypepattern.example2.Geometry;
import com.lonphy.prototypepattern.example2.Rectangle;

public class Example2Test {
	@Test
	public void testMain() throws CloneNotSupportedException {
		Geometry g = new Geometry(100, new Rectangle(10, 20));
		Geometry gCopy = (Geometry) g.clone();
		System.out.println("geometry对象中的rectangle的长和宽：");
		System.out.println(g.getRectangle().getM()+","+g.getRectangle().getN());
		System.out.println("geometry克隆对象中的rectangle的长和宽：");
		System.out.println(gCopy.getRectangle().getM()+","+gCopy.getRectangle().getN());
		g.getRectangle().setM(456.98);
		g.getRectangle().setN(123.15);
		System.out.println("geometry对象中的rectangle的长和宽：");
		System.out.println(g.getRectangle().getM()+","+g.getRectangle().getN());
		System.out.println("geometry克隆对象中的rectangle的长和宽：");
		System.out.println(gCopy.getRectangle().getM()+","+gCopy.getRectangle().getN());
		
	}
}
