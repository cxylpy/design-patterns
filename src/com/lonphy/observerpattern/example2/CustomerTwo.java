package com.lonphy.observerpattern.example2;

public class CustomerTwo implements Observer{
	private Subject subject;
	private String personName;
	private double oldPrice,newPrice;
	
	public CustomerTwo(Subject subject, String personName) {
		this.subject = subject;
		this.personName = personName;
		subject.addObserver(this);
	}

	@Override
	public void update() {
		if(subject instanceof ShopSubject) {
			oldPrice = ((ShopSubject)subject).getOldPrice();
			newPrice = ((ShopSubject)subject).getNewPrice();
			System.out.println(personName+"只对商品的原价和折扣后的价格感兴趣");
			System.out.println("原价是："+oldPrice);
			System.out.println("现价是："+newPrice);
		}
	}

}
