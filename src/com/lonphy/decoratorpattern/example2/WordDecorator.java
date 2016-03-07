package com.lonphy.decoratorpattern.example2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WordDecorator extends Decorator {
	File decoratorFile;

	public WordDecorator(ReadWord reader, File decoratorFile) {
		super(reader);
		this.decoratorFile = decoratorFile;
	}

	@Override
	public ArrayList<String> readWrod(File file) {
		ArrayList<String> wordList = reader.readWrod(file);
		try {
			FileReader fr = new FileReader(decoratorFile);
			BufferedReader br = new BufferedReader(fr);
			String s = null;
			int m = 0;
			while ((s = br.readLine()) != null) {
				if (m > wordList.size())
					break;
				String word = wordList.get(m);
				word = word.concat(" | " + s);
				wordList.set(m, word);
				m++;
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return wordList;
	}

}
