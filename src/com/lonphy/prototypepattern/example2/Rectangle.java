package com.lonphy.prototypepattern.example2;

public class Rectangle implements Cloneable{
	private double m,n;

	public Rectangle(double m, double n) {
		this.m = m;
		this.n = n;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	public double getM() {
		return m;
	}
	public void setM(double m) {
		this.m = m;
	}
	public double getN() {
		return n;
	}
	public void setN(double n) {
		this.n = n;
	}
	
}
