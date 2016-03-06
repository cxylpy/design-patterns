package com.lonphy.observerpattern.example5;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ShowDigit extends JPanel implements Observer{
	private Observable subject;
	private JTextArea text;
	private Vector<String> vector;
	public ShowDigit(Observable subject) {
		this.subject = subject;
		subject.addObserver(this);
		text = new JTextArea(10,15);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		text.setEditable(true);
		add(new JScrollPane(text));
		vector = new Vector<>();
	}
	@Override
	public void update(Observable o, Object arg) {
		text.setText(null);
		text.append("出现的数字有：\n");
		vector.removeAllElements();
		String content = arg.toString();
		String regex = "\\D+";
		String digitWords[] = content.split(regex);
		for(int i = 0; i < digitWords.length; i++) {
			if(!vector.contains(digitWords[i]))vector.add(digitWords[i]);
		}
		for(int i = 0; i < vector.size(); i++) {
			text.append(vector.elementAt(i)+" ");
		}
		
	}
	

}
