package com.lonphy.appearancepattern.example2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
	public String readFileContent(String fileName) {
		StringBuffer str = new StringBuffer();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			String s = null;
			while((s=br.readLine())!=null) {
				str.append(s);
				str.append('\n');
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new String(str);
	}
}
