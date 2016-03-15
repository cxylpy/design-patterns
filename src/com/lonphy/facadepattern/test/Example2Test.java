package com.lonphy.facadepattern.test;

import org.junit.Test;

import com.lonphy.facadepattern.example2.ReadAndWriteFacade;

public class Example2Test {
	@Test
	public void testMain() {
		ReadAndWriteFacade facade = new ReadAndWriteFacade();
		String readFileName = "index.html";
		String delContent = "<[^>]*>";
		String savedFileName = "save.txt";
		facade.doOption(readFileName, delContent, savedFileName);
	}
}
