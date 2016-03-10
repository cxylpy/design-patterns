package com.lonphy.chainofresponsibilitypattern.example2;

public interface Handler {
	public abstract void computeMultiply(String number);
	public abstract void setNextHandler(Handler handler);
}
