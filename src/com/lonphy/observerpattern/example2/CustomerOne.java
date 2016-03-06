package com.lonphy.observerpattern.example2;

public class CustomerOne implements Observer{
	private Subject subject;
	private String goodsName, personName;
	public CustomerOne(Subject subject, String personName) {
		this.subject = subject;
		this.personName = personName;
		subject.addObserver(this);
	}

	@Override
	public void update() {
		if(subject instanceof ShopSubject) {
			goodsName = ((ShopSubject)subject).getGoodsName();
			System.out.println(personName+"只对打折商品的名字感兴趣：");
			System.out.println("打折的商品是："+goodsName);
		}
	}
}
