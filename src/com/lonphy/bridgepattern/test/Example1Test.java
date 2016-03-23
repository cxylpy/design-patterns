package com.lonphy.bridgepattern.test;

import org.junit.Test;

import com.lonphy.bridgepattern.example1.ArchitectureCost;
import com.lonphy.bridgepattern.example1.BuildingCost;
import com.lonphy.bridgepattern.example1.BuildingDesign;
import com.lonphy.bridgepattern.example1.HouseDesign;

public class Example1Test {
	@Test
	public void testMain() {
		double width = 63, height = 30;
		int floorNumber = 8;
		double unitPrice = 6867.38;
		BuildingDesign design = new HouseDesign(width, height, floorNumber);
		System.out.println("宽"+width+"米，高"+height+"米,层数为"+floorNumber);
		ArchitectureCost cost = new BuildingCost(design, unitPrice);
		double price = cost.giveCost();
		System.out.println("每平方米造价："+unitPrice+"元的商业楼的建设成本："+price);
		width = 52;
		height = 28;
		floorNumber = 6;
		unitPrice = 2687.88;
		design = new HouseDesign(width, height, floorNumber);
		System.out.println("宽"+width+"米，高"+height+"米，层数为"+floorNumber);
		cost = new BuildingCost(design, unitPrice);
		price = cost.giveCost();
		System.out.println("每平方米造价："+unitPrice+"元的商业楼的建设成本："+price);
	}
}
