package com.lonphy.bridgepattern.example1;

public class HouseDesign implements BuildingDesign{
	private double width, length;
	private int floorNumber;
	
	public HouseDesign(double width, double length, int floorNumber) {
		this.width = width;
		this.length = length;
		this.floorNumber = floorNumber;
	}

	@Override
	public double computeArea() {
		return width * length * floorNumber;
	}
	
}
