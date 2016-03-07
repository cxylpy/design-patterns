package com.lonphy.observerpattern.example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class UniversityStudent implements Observer{
	private Subject subject;
	private File myFile;
	public UniversityStudent(Subject subject, String fileName) {
		this.subject = subject;
		subject.addObserver(this); //使当前实例成为subject所引用的具体主题的观察者
		myFile = new File(fileName);
	}
	@Override
	public void hearTelephone(String heardMess) {
		try {
			RandomAccessFile out = new RandomAccessFile(myFile, "rw");
			out.seek(out.length());
			byte[] b = heardMess.getBytes();
			out.write(b);
			System.out.println("我是一名大学生，我向文件"+myFile.getName()+"写入如下内容:");
			System.out.println(heardMess);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
