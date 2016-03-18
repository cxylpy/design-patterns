package com.lonphy.abstractfactorypattern.example1;

public class ShanghaiClothesFactory extends ClothesFactory{

	@Override
	public UpperClothes createUpperClothes(int chestSize, int height) {
		return new CowboyUpperClothes(chestSize, height, "上海牌牛仔上衣");
	}

	@Override
	public Trousers createTrousers(int waistSize, int height) {
		return new CowboyTrousers(waistSize, height, "上海牌牛仔裤");
	}

}
