package com.lonphy.abstractfactorypattern.example1;

public class BeijingClothesFactory extends ClothesFactory{

	@Override
	public UpperClothes createUpperClothes(int chestSize, int height) {
		return new WesternUpperClothes(chestSize, height, "北京牌西服上衣");
	}

	@Override
	public Trousers createTrousers(int waistSize, int height) {
		return new WesternTrousers(waistSize, height, "北京牌西服裤子");
	}

}
