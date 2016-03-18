package com.lonphy.factormethodpattern.example1;

public class BluePenCore extends PenCore{
	
	
	public BluePenCore() {
		super();
		color = "蓝色";
	}

	@Override
	public void writeWord(String word) {
		System.out.println("写出"+color+"的字："+word);
	}

}
