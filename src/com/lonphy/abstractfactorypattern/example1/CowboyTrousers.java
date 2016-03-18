package com.lonphy.abstractfactorypattern.example1;

public class CowboyTrousers extends Trousers{
	private int waistSize;
	private int height;
	private String name;
	
	public CowboyTrousers(int waistSize, int height, String name) {
		this.waistSize = waistSize;
		this.height = height;
		this.name = name;
	}

	@Override
	public int getWaistSize() {
		return waistSize;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public String getName() {
		return name;
	}

}
