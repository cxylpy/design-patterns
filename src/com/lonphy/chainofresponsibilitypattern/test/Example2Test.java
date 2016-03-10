package com.lonphy.chainofresponsibilitypattern.test;

import org.junit.Test;

import com.lonphy.chainofresponsibilitypattern.example2.Handler;
import com.lonphy.chainofresponsibilitypattern.example2.UseBigInteger;
import com.lonphy.chainofresponsibilitypattern.example2.UseInt;
import com.lonphy.chainofresponsibilitypattern.example2.UseLong;

public class Example2Test {
	private Handler useInt,useLong,useBig;
	@Test
	public void testMain() {
		useInt = new UseInt();
		useLong = new UseLong();
		useBig = new UseBigInteger();
		useInt.setNextHandler(useLong);
		useLong.setNextHandler(useBig);
		
		useInt.computeMultiply("32");
		
	}
}
