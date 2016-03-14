package com.lonphy.appearancepattern.example2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;

public class WriteFile {
	public void writeToFile(String fileName, String content) {
		try {
			StringBuffer str = new StringBuffer();
			StringReader sr = new StringReader(content);
			BufferedReader br = new BufferedReader(sr);
			FileWriter fw = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw);
			String s = null;
			while((s=br.readLine())!=null) {
				bw.write(s);
				bw.newLine();
				bw.flush();
			}
			bw.close();
			fw.close();
			br.close();
			sr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
