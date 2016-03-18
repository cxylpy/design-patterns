package com.lonphy.factormethodpattern.example1;

public abstract class PenCore {
	protected String color;
	public abstract void writeWord(String word);
	public String getColor() {
		return color;
	}
	
}
