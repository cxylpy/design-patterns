package com.lonphy.decoratorpattern.example2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadEnglishWord extends ReadWord{

	@Override
	public ArrayList<String> readWrod(File file) {
		ArrayList<String> wordList = new ArrayList<>();
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String s = null;
			while((s=br.readLine())!=null) {
				wordList.add(s);
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
