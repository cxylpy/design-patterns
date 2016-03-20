package com.lonphy.builderpattern.test;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.junit.Test;

import com.lonphy.builderpattern.example1.Builder;
import com.lonphy.builderpattern.example1.ConcreteBuilderOne;
import com.lonphy.builderpattern.example1.ConcreteBuilderTwo;
import com.lonphy.builderpattern.example1.Director;

public class Example1Test {
	public static void main(String[] args) {
		
		Builder builder = new ConcreteBuilderOne();
		Director director = new Director(builder);
		JPanel panel = director.constructProduct();
		JFrame frameOne = new JFrame();
		frameOne.add(panel);
		frameOne.setBounds(12, 12, 200, 120);
		frameOne.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameOne.setVisible(true);
		builder = new ConcreteBuilderTwo();
		director = new Director(builder);
		panel = director.constructProduct();
		JFrame frameTwo = new JFrame();
		frameTwo.add(panel);
		frameTwo.setBounds(212, 12, 200, 120);
		frameTwo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frameTwo.setVisible(true);
	}
}
