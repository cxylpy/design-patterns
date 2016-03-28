package com.lonphy.visitorpattern.example2;

public class Man extends Person{
	private String name;
	private double stature,eyeSight;
	public Man(String name, double stature, double eyeSight) {
		this.name = name;
		this.stature = stature;
		this.eyeSight = eyeSight;
	}
	public String getName() {
		return name;
	}
	public double getStature() {
		return stature;
	}
	public double getEyeSight() {
		return eyeSight;
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
}
