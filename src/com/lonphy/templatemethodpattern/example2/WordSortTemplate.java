package com.lonphy.templatemethodpattern.example2;

import java.io.File;
import java.util.Arrays;

public class WordSortTemplate extends WordsTemplate{

	public WordSortTemplate(File file) {
		super(file);
	}
	@Override
	public void sort(String[] word) {
		Arrays.sort(word);
	}
	
}
