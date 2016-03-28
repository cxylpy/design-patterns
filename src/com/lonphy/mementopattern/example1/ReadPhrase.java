package com.lonphy.mementopattern.example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;

public class ReadPhrase {
	private long readPosition;
	private File file;
	private RandomAccessFile raf;
	private String phrase;
	public ReadPhrase(File file) {
		this.file = file;
		try {
			raf = new RandomAccessFile(file, "r");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public Memento createMemento() {
		Memento mem = new Memento();
		mem.setState(readPosition);
		return mem;
	}
	public void restoreFromMemento(Memento mem) {
		readPosition = mem.getState();
	}
	public String readLine() {
		try {
			raf.seek(readPosition);
			phrase = raf.readLine();
			if(phrase!=null) {
				byte[] bytes = phrase.getBytes("iso-8859-1");
				phrase = new String(bytes);
			}
			readPosition = raf.getFilePointer();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return phrase;
	}
	public void closeRead() {
		try {
			raf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
