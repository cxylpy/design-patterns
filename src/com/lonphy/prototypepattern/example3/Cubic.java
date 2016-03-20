package com.lonphy.prototypepattern.example3;

public class Cubic implements Prototype,Cloneable{
	private double length, width, height;
	
	public Cubic(double length, double width, double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}

	@Override
	public Object cloneMe() throws CloneNotSupportedException {
		return clone();
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
