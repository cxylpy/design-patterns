package com.lonphy.templatemethodpattern.example2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public abstract class WordsTemplate {
	protected File file;
	protected String content;
	protected String[] word;

	public WordsTemplate(File file) {
		this.file = file;
		content = "";
	}

	public final void showAllWords() {
		readContent();
		getWords();
		if (shouldSort())
			sort(word);
		printWords(word);
	}

	public boolean shouldSort() {
		return true;
	}

	public final void readContent() {
		try {
			StringBuffer str = new StringBuffer();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s = null;
			while ((s = br.readLine()) != null)
				str.append(s + "\n");
			content = new String(str);
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public final void getWords() {
		String regex = "[\\s\\d\\p{Punct}]+";
		word = content.split(regex);
	}

	public void sort(String[] word) {
	}

	public final void printWords(String[] word) {
		for (int i = 0; i < word.length; i++) {
			System.out.printf("%-10s", word[i]);
		}
		System.out.println();
	}
}
