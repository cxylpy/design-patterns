package com.lonphy.factormethodpattern.example1;

public class BlackPenCore extends PenCore{
	
	
	public BlackPenCore() {
		super();
		color = "黑色";
	}

	@Override
	public void writeWord(String word) {
		System.out.println("写出"+color+"的字："+word);
	}

}
