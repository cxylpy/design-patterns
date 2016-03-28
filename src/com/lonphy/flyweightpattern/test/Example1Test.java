package com.lonphy.flyweightpattern.test;

import org.junit.Test;

import com.lonphy.flyweightpattern.example1.Car;
import com.lonphy.flyweightpattern.example1.Flyweight;
import com.lonphy.flyweightpattern.example1.FlyweightFactory;

public class Example1Test {
	@Test
	public void testMain() {
		FlyweightFactory factory = FlyweightFactory.getFactory();
		double width = 1.82, height = 1.47, length = 5.12;
		String key = width + "#" + height + "#" + length;
		Flyweight flyweight = factory.getFlyweight(key);
		Car audiA60One = new Car(flyweight, "奥迪A6", "黑色", 128);
		Car audiA60Two = new Car(flyweight, "奥迪A6", "灰色", 160);
		audiA60One.print();
		audiA60Two.print();
		width = 1.77;
		height = 1.45;
		length = 4.63;
		key = width + "#" + height + "#" + length;
		flyweight = factory.getFlyweight(key);
		flyweight.printMsg(" 名称： 奥迪A4 颜色：蓝色 功率：126");
		flyweight.printMsg(" 名称：奥迪A4 颜色：红色 功率：138");
	}
}
