package com.lonphy.proxypattern.example1;

public class Triangle implements Geometry{
	private double a,b,c,area;
	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public double calcArea() {
		double p = (a+b+c)/2.;
		area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		return area;
	}

}
