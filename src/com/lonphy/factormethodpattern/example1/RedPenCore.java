package com.lonphy.factormethodpattern.example1;

public class RedPenCore extends PenCore{
	
	
	public RedPenCore() {
		super();
		color = "红色";
	}

	@Override
	public void writeWord(String word) {
		System.out.println("写出"+color+"的字："+word);
	}

}
