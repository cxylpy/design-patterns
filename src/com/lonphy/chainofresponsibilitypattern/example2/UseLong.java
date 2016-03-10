package com.lonphy.chainofresponsibilitypattern.example2;

public class UseLong implements Handler{
	private Handler handler;
	private long result = 1;
	
	@Override
	public void computeMultiply(String number) {
		long n = Long.parseLong(number);
		long i = 1;
		while(i<=n) {
			result*=i;
			if(result<=0) {
				System.out.println("超出我的能力范围，我计算不了");
				handler.computeMultiply(number);
				return;
			}
			i++;
		}
		System.out.println(number+"的阶乘："+result);
	}

	@Override
	public void setNextHandler(Handler handler) {
		this.handler = handler;
	}

}
