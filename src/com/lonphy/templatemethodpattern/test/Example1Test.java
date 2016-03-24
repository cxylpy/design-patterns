package com.lonphy.templatemethodpattern.test;

import java.io.File;

import org.junit.Test;

import com.lonphy.templatemethodpattern.example1.AbstractTemplate;
import com.lonphy.templatemethodpattern.example1.ConcreteTemplate1;
import com.lonphy.templatemethodpattern.example1.ConcreteTemplate2;

public class Example1Test {
	@Test
	public void testMain() {
		File dir = new File("D:/work_and_study");
		AbstractTemplate template = new ConcreteTemplate1(dir);
		System.out.println(dir.getPath()+"目录下的文件:");
		template.showFileName();
		template = new ConcreteTemplate2(dir);
		System.out.println(dir.getPath()+"目录下的文件:");
		template.showFileName();
		
	}
}
