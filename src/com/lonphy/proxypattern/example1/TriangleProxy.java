package com.lonphy.proxypattern.example1;

public class TriangleProxy implements Geometry{
	private double a,b,c;
	private Triangle triangle;
	
	public TriangleProxy(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double calcArea() {
		if(a+b>c&&a+c>b&&b+c>a) {
			triangle = new Triangle(a, b, c);
			return triangle.calcArea();
		} else return -1;
	}

}
