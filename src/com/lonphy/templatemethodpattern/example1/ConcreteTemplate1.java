package com.lonphy.templatemethodpattern.example1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConcreteTemplate1 extends AbstractTemplate{

	public ConcreteTemplate1(File dir) {
		super(dir);
	}

	@Override
	public void sort() {
		for(int i = 0; i < allFiles.length; i++) {
			for(int j = i+1; j < allFiles.length; j++) {
				if(allFiles[j].lastModified()<allFiles[i].lastModified()) {
					File file = allFiles[j];
					allFiles[j] = allFiles[i];
					allFiles[i] = file;
				}
			}
		}
	}

	@Override
	public void printFiles() {
		for(int i = 0; i < allFiles.length; i++) {
			long time = allFiles[i].lastModified();
			Date date = new Date(time);
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String str = format.format(date);
			String name = allFiles[i].getName();
			System.out.println((i+1)+" : "+name+"("+str+")");
		}
	}

}
