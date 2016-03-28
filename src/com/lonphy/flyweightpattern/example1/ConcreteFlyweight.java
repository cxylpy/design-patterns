package com.lonphy.flyweightpattern.example1;

public class ConcreteFlyweight implements Flyweight{
	private double width;
	private double height;
	private double length;
	
	public ConcreteFlyweight(double width, double height, double length) {
		this.width = width;
		this.height = height;
		this.length = length;
	}

	@Override
	public double getHeight() {
		return height;
	}

	@Override
	public double getWidth() {
		return width;
	}

	@Override
	public double getLength() {
		return length;
	}

	@Override
	public void printMsg(String msg) {
		System.out.print(msg);
		System.out.print(" 宽度："+width);
		System.out.print(" 高度："+height);
		System.out.println(" 长度："+length);
	}

}
