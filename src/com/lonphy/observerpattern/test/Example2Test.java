package com.lonphy.observerpattern.test;

import org.junit.Test;

import com.lonphy.observerpattern.example2.CustomerOne;
import com.lonphy.observerpattern.example2.CustomerTwo;
import com.lonphy.observerpattern.example2.ShopSubject;

public class Example2Test {
	@Test
	public void testMain() {
		ShopSubject shop = new ShopSubject();
		CustomerOne one = new CustomerOne(shop, "张三");
		CustomerTwo two = new CustomerTwo(shop, "李四");
		shop.setDiscountGoods("数码相机", 2300, 2000);
		shop.setDiscountGoods("手机", 1234, 1000);
	}
	
}
