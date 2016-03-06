package com.lonphy.observerpattern.example5;

import java.util.Observable;

import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class InputTextSubject extends Observable{
	private String content;
	private JTextArea text;
	public InputTextSubject() {
		text = new JTextArea(10, 15);
		text.setLineWrap(true);
		text.setWrapStyleWord(true);
		text.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				changedUpdate(e);
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				changedUpdate(e);
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				content =text.getText();
				setChanged();
				notifyObservers(content);
			}
		});
	}
	public String getContent() {
		return content;
	}
	public JTextArea getTextArea() {
		return text;
	}
	
}
