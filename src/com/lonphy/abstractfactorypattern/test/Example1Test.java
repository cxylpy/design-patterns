package com.lonphy.abstractfactorypattern.test;

import org.junit.Test;

import com.lonphy.abstractfactorypattern.example1.BeijingClothesFactory;
import com.lonphy.abstractfactorypattern.example1.ClothesFactory;
import com.lonphy.abstractfactorypattern.example1.ShanghaiClothesFactory;
import com.lonphy.abstractfactorypattern.example1.Shop;

public class Example1Test {
	@Test
	public void testMain() {
		Shop shop = new Shop();
		ClothesFactory factory = new BeijingClothesFactory();
		shop.setSuit(factory, 110, 82, 170);
		factory = new ShanghaiClothesFactory();
		shop.setSuit(factory, 120, 88, 180);
	}
}
