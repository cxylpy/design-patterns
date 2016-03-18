package com.lonphy.abstractfactorypattern.example1;

public class CowboyUpperClothes extends UpperClothes{
	private int chestSize;
	private int height;
	private String name;
	
	public CowboyUpperClothes(int chestSize, int height, String name) {
		this.chestSize = chestSize;
		this.height = height;
		this.name = name;
	}

	@Override
	public int getChestSize() {
		return chestSize;
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
