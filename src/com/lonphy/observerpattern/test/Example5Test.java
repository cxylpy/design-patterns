package com.lonphy.observerpattern.test;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import com.lonphy.observerpattern.example5.InputTextSubject;
import com.lonphy.observerpattern.example5.ShowDigit;
import com.lonphy.observerpattern.example5.ShowWord;

public class Example5Test extends JFrame{
	public Example5Test() {
		InputTextSubject textSubject = new InputTextSubject();
		ShowWord observerOne = new ShowWord(textSubject);
		ShowDigit observerTwo = new ShowDigit(textSubject);
		setLayout(new FlowLayout());
		add(new JScrollPane(textSubject.getTextArea()));
		add(observerOne);
		add(observerTwo);
		setBounds(20,20,400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Example5Test();
	}
}
