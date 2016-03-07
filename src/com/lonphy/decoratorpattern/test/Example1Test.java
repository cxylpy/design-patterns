package com.lonphy.decoratorpattern.test;

import org.junit.Test;

import com.lonphy.decoratorpattern.example1.Bird;
import com.lonphy.decoratorpattern.example1.Sparrow;
import com.lonphy.decoratorpattern.example1.SparrowDecorator;

public class Example1Test {
	public void showBird(Bird bird) {
		System.out.println("这只鸟能飞行"+bird.fly()+"米");
	}
	@Test
	public void testMain() {
		Bird sparrow = new Sparrow();
		Bird sparrowDecorator1 = new SparrowDecorator(sparrow);
		Bird sparrowDecorator2 = new SparrowDecorator(sparrowDecorator1);
		showBird(sparrow);
		showBird(sparrowDecorator1);
		showBird(sparrowDecorator2);
	}
}
