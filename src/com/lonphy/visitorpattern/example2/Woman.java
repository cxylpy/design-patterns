package com.lonphy.visitorpattern.example2;

public class Woman extends Person {
	private String name;
	private double stature, eyeSight;
	private int bloodSugar;

	public Woman(String name, double stature, double eyeSight, int bloodSugar) {
		this.name = name;
		this.stature = stature;
		this.eyeSight = eyeSight;
		this.bloodSugar = bloodSugar;
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


	public int getBloodSugar() {
		return bloodSugar;
	}


	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}



}
