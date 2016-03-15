package com.lonphy.facadepattern.example1;

public class Charge {
	public final int BASICCHARGE=12;
	private CheckWord checkWord;
	public Charge(CheckWord checkWord) {
		this.checkWord = checkWord;
	}
	public void giveCharge() {
		int charge = checkWord.getAmount()*BASICCHARGE;
		System.out.println("广告费用："+charge+"元");
	}
}
