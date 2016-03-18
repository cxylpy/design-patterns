package com.lonphy.abstractfactorypattern.example1;

public abstract class ClothesFactory {
	public abstract UpperClothes createUpperClothes(int chestSize, int height);
	public abstract Trousers createTrousers(int waistSize, int height);
}
