package com.lonphy.commandpattern.example5;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Light extends JPanel{
	private String name;
	private Icon imageIcon;
	private JLabel label;
	public Light() {
		super();
		label =  new JLabel("我是照明灯");
		add(label);
	}
	public void on() {
		label.setIcon(new ImageIcon("light_on.png"));
	}
	public void off() {
		label.setIcon(new ImageIcon("light_off.png"));
	}
	

}
