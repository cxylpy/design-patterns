package com.lonphy.templatemethodpattern.test;

import java.io.File;

import org.junit.Test;

import com.lonphy.templatemethodpattern.example2.WordNoSortTemplate;
import com.lonphy.templatemethodpattern.example2.WordSortTemplate;
import com.lonphy.templatemethodpattern.example2.WordsTemplate;

public class Example2Test {
	@Test
	public void testMain() {
		File file = new File("hello.txt");
		WordsTemplate template = new WordSortTemplate(file);
		System.out.println(file.getName()+"中有如下的单词（按字典序排序）:");
		template.showAllWords();
		template = new WordNoSortTemplate(file);
		System.out.println(file.getName()+"中有如下的单词（按文中出现的先后顺序）:");
		template.showAllWords();
	}
}
