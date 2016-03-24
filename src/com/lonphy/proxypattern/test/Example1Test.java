package com.lonphy.proxypattern.test;

import java.util.Scanner;

import org.junit.Test;

import com.lonphy.proxypattern.example1.Geometry;
import com.lonphy.proxypattern.example1.TriangleProxy;

public class Example1Test {
	@Test
	public void testMain() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入三个数，每输入一个数请输入回车");
		double a = -1, b = -1, c = -1;
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		Geometry triangle = new TriangleProxy(a, b, c);
		double area = triangle.calcArea();
		System.out.println("面积是："+area);
	}
}
