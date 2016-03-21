package com.lonphy.singletonpattern.example1;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	private String str;
	public MyFrame(String title) {
		setTitle(title);
		Moon moon = Moon.getMoon();
		str = moon.show();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		repaint();
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setFont(new Font("宋体",Font.BOLD,15));
		g.drawString(str, 5, 100);
	}
	
}
