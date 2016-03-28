package com.lonphy.flyweightpattern.example1;

public class Car {
	private Flyweight flyweight;
	private String name,color;
	private int power;
	public Car(Flyweight flyweight, String name, String color, int power) {
		this.flyweight = flyweight;
		this.name = name;
		this.color = color;
		this.power = power;
	}
	public void print() {
		System.out.print(" 名称："+name);
		System.out.print(" 颜色："+color);
		System.out.print(" 功率："+power);
		System.out.print(" 宽度："+flyweight.getWidth());
		System.out.print(" 高度："+flyweight.getHeight());
		System.out.println(" 长度："+flyweight.getLength());
	}
}
