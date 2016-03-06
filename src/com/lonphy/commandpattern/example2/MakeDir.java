package com.lonphy.commandpattern.example2;

import java.io.File;

public class MakeDir {
	public void createDir(String name) {
		File dir = new File(name);
		dir.mkdir();
	}
	
	public void deleteDir(String name) {
		File dir = new File(name);
		dir.delete();
	}
}
