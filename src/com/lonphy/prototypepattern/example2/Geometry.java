package com.lonphy.prototypepattern.example2;


public class Geometry implements Cloneable{
	private int height;
	private Rectangle rectangle;
	public Geometry(int height, Rectangle rectangle) {
		this.height = height;
		this.rectangle = rectangle;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Geometry object = (Geometry)super.clone();
		object.rectangle = (Rectangle) rectangle.clone();//深度克隆
		return object;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Rectangle getRectangle() {
		return rectangle;
	}

	public void setRectangle(Rectangle rectangle) {
		this.rectangle = rectangle;
	}
	
}
