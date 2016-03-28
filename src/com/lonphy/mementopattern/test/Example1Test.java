package com.lonphy.mementopattern.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

import org.junit.Test;

import com.lonphy.mementopattern.example1.Caretaker;
import com.lonphy.mementopattern.example1.Memento;
import com.lonphy.mementopattern.example1.ReadPhrase;

public class Example1Test {
	@Test
	public void testMain() {
		Scanner scanner = new Scanner(System.in);
		ReadPhrase readPhrase = new ReadPhrase(new File("phrase.txt"));
		File favorPhrase = new File("favorPhrase.txt");
		RandomAccessFile raf = null;
		try {
			raf = new RandomAccessFile(favorPhrase, "rw");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("是否从上次读取的位置继续读取成语（y/n)");
		String answer = scanner.nextLine();
		if(answer.startsWith("y")||answer.startsWith("Y")) {
			Caretaker caretaker = new Caretaker();
			Memento memento = caretaker.getMemento();
			if(memento!=null) 
				readPhrase.restoreFromMemento(memento);
		}
		String phrase = null;
		while((phrase=readPhrase.readLine())!=null) {
			System.out.println(phrase);
			System.out.println("是否将该成语保存到"+favorPhrase.getName());
			answer = scanner.nextLine();
			if(answer.startsWith("y")||answer.startsWith("Y")) {
				try {
					raf.seek(favorPhrase.length());
					byte[] bytes = phrase.getBytes();
					raf.write(bytes);
					raf.writeChar('\n');
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			System.out.println("是否继续读取成语？(y/n)");
			answer= scanner.nextLine();
			if(answer.startsWith("y")||answer.startsWith("Y")) continue;
			else {
				readPhrase.closeRead();Caretaker caretaker = new Caretaker();
				caretaker.saveMemento(readPhrase.createMemento());
				try {
					raf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				System.exit(0);
			}
		}
		
	}
}
