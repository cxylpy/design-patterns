package com.lonphy.facadepattern.test;

import org.junit.Test;

import com.lonphy.facadepattern.example1.ClientServerFacade;

public class Example1Test {
	@Test
	public void testMain() {
		String advertisement = "月光电脑，价格4000元，联系电话：12345";
		ClientServerFacade client = new ClientServerFacade(advertisement);
		client.doAdvertisement();
	}
}
