package com.lonphy.mediatorpattern.example1;

public interface Colleague {
	public void giveMsg(String[] msg);
	public void receiveMsg(String msg);
	public void setName(String name);
	public String getName();
}
