package com.lonphy.abstractfactorypattern.example1;

public class Shop {
	UpperClothes clothes;
	Trousers trousers;
	public void setSuit(ClothesFactory factory, int chestSize, int waistSize, int height) {
		clothes = factory.createUpperClothes(chestSize, height);
		trousers = factory.createTrousers(waistSize, height);
		showMsg();
	}
	
	public void showMsg() {
		System.out.println("<套装信息>");
		System.out.println(clothes.getName()+":");
		System.out.println("胸围："+clothes.getChestSize());
		System.out.println("身高："+clothes.getHeight());
		System.out.println(trousers.getName()+":");
		System.out.println("腰围："+trousers.getWaistSize());
		System.out.println("身高："+trousers.getHeight());
	}
}
