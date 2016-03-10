package com.lonphy.chainofresponsibilitypattern.example2;

import java.math.BigInteger;

public class UseBigInteger implements Handler{
	private Handler handler;
	private BigInteger result = new BigInteger("1");
	@Override
	public void computeMultiply(String number) {
		BigInteger n = new BigInteger(number);
		BigInteger one = new BigInteger("1");
		BigInteger i = new BigInteger("1");
		while(i.compareTo(n)<=0) {
			result = result.multiply(i);
			i = i.add(one);
		}
		System.out.println(number+"的阶乘："+result);
	}

	@Override
	public void setNextHandler(Handler handler) {
		this.handler = handler;
	}

}
