package com.lonphy.decoratorpattern.test;

import java.io.File;
import java.util.ArrayList;

import org.junit.Test;

import com.lonphy.decoratorpattern.example2.ReadEnglishWord;
import com.lonphy.decoratorpattern.example2.ReadWord;
import com.lonphy.decoratorpattern.example2.WordDecorator;

public class Example2Test {
	@Test
	public void testMain() {
		ArrayList<String> wordList = new ArrayList<>();
		ReadEnglishWord rew = new ReadEnglishWord();
		WordDecorator wd1 = new WordDecorator(rew, new File("chinese.txt"));
		ReadWord reader = wd1;
		wordList = reader.readWrod(new File("word.txt"));
		for(int i = 0; i < wordList.size(); i++) {
			System.out.println(wordList.get(i));
		}
		WordDecorator wd2 = new WordDecorator(wd1, new File("englishSentence.txt"));
		reader = wd2;
		wordList = reader.readWrod(new File("word.txt"));
		for(int i = 0; i < wordList.size(); i++) {
			System.out.println(wordList.get(i));
		}
	}
}
