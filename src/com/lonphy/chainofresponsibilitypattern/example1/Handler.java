package com.lonphy.chainofresponsibilitypattern.example1;

public interface Handler {
	public abstract void handleRequest(String number);
	public abstract void setNextHandler(Handler handler);
}
