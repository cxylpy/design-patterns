package com.lonphy.bridgepattern.example1;

public class BuildingCost extends ArchitectureCost{
	public BuildingCost(BuildingDesign design, double unitPrice) {
		this.design = design;
		this.unitPrice = unitPrice;
	}
	@Override
	public double giveCost() {
		double area = design.computeArea();
		return area*unitPrice;
	}

}
