package com.lonphy.bridgepattern.example2;

import java.util.ArrayList;

public class FilmProgram implements Program{
	private ArrayList<String> content;
	public FilmProgram() {
		content = new ArrayList<>();
	}
	@Override
	public ArrayList<String> makeTVProgram() {
		content.clear();
		content.add("地道战");
		content.add("疯狂动物城");
		content.add("盗梦空间");
		content.add("了不起的盖茨比");
		return content;
	}
	
}
