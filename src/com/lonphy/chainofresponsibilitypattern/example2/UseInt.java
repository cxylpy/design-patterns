package com.lonphy.chainofresponsibilitypattern.example2;

public class UseInt implements Handler{
	private Handler handler;
	private int result = 1;
	@Override
	public void computeMultiply(String number) {
		int n = Integer.parseInt(number);
		int i = 1;
		while(i<=n){
			result *= i;
			if(result <=0) {
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
