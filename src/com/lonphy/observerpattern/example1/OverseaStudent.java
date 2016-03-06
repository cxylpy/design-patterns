package com.lonphy.observerpattern.example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class OverseaStudent implements Observer{
	private Subject subject;
	private File myFile;
	public OverseaStudent(Subject subject, String fileName) {
		this.subject =subject;
		subject.addObserver(this);
		myFile = new File(fileName);
	}
	
	@Override
	public void hearTelephone(String heardMess) {
		try {
			boolean ok = heardMess.contains("java程序员")||heardMess.contains("软件");
			if(ok) {
				RandomAccessFile out = new RandomAccessFile(myFile, "rw");
				out.seek(out.length());
				byte[] b = heardMess.getBytes();
				out.write(b);
				System.out.println("我是一个海归，我向文件"+myFile.getName()+"写入如下内容：");
				System.out.println(heardMess);
			} else {
				System.out.println("我是海归，这次的信息中没有我需要的信息");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
