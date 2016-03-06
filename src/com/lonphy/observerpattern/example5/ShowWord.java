package com.lonphy.observerpattern.example5;

import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.TreeSet;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ShowWord extends JPanel implements Observer{
	private Observable subject;
	private JTextArea text;
	TreeSet<String> wordList;
	public ShowWord(Observable subject) {
		this.subject =subject;
		subject.addObserver(this);
		text = new JTextArea(10,15);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		text.setEditable(false);
		add(new JScrollPane(text));
		wordList = new TreeSet<>();
	}
	@Override
	public void update(Observable o, Object arg) {
		text.setText(null);
		text.append("出现的单词有（按字典序排序）:\n");
		wordList.clear();
		String content = arg.toString();
		String regex = "[\\s\\d\\p{Punct}]+";
		String words[] = content.split(regex);
		for(int i = 0; i < words.length;i++) {
			wordList.add(words[i]);
		}
		Iterator<String> iterator = wordList.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			text.append(str+" ");
		}
	}

}
