package com.lonphy.mementopattern.example1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Caretaker {
	private File file;
	private Memento memento;
	public Caretaker() {
		file = new File("saveObject.txt");
	}
	public Memento getMemento() {
		if(file.exists()) {
			try {
				FileInputStream fis = new FileInputStream("saveObject.txt");
				ObjectInputStream ois = new ObjectInputStream(fis);
				memento = (Memento) ois.readObject();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return memento;
	}
	public void saveMemento(Memento memento) {
		try {
			FileOutputStream fos = new FileOutputStream("saveObject.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(memento);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
