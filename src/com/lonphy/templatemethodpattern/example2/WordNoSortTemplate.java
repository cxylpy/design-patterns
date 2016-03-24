package com.lonphy.templatemethodpattern.example2;

import java.io.File;

public class WordNoSortTemplate extends WordsTemplate{

	public WordNoSortTemplate(File file) {
		super(file);
	}
	@Override
	public boolean shouldSort() {
		return false;
	}

}
