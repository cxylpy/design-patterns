package com.lonphy.facadepattern.example1;

public class CheckWord {
	public final int BASICAMOUNT=85;
	private String advertisement;
	private int amount;
	public CheckWord(String advertisement) {
		this.advertisement = advertisement;
	}
	public void setChargeAmount() {
		amount = advertisement.length()+BASICAMOUNT;
	}
	public int getAmount() {
		return amount;
	}
}
