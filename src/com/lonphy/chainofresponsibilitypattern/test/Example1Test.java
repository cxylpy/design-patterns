package com.lonphy.chainofresponsibilitypattern.test;

import org.junit.Test;

import com.lonphy.chainofresponsibilitypattern.example1.Beijing;
import com.lonphy.chainofresponsibilitypattern.example1.Handler;
import com.lonphy.chainofresponsibilitypattern.example1.ShangHai;
import com.lonphy.chainofresponsibilitypattern.example1.Tianjin;

public class Example1Test {
	private Handler beijing,tianjin,shanghai;
	@Test
	public void testMain() {
		tianjin = new Tianjin();
		beijing = new Beijing();
		shanghai = new ShangHai();
		beijing.setNextHandler(tianjin);
		tianjin.setNextHandler(shanghai);
		System.out.println("第一个人：");
		beijing.handleRequest("11158498115989189");
		System.out.println("第二个人：");
		beijing.handleRequest("45648979484984984984");
		System.out.println("第三个人：");
		beijing.handleRequest("78949498984981231");
	}
	
}
