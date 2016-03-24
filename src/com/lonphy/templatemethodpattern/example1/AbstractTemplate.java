package com.lonphy.templatemethodpattern.example1;

import java.io.File;

public abstract class AbstractTemplate {
	protected File[] allFiles;
	protected File dir;
	public AbstractTemplate(File dir) {
		this.dir = dir;
	}
	public final void showFileName() {
		allFiles = dir.listFiles();
		sort();
		printFiles();
	}
	public abstract void sort();
	public abstract void printFiles();
}
