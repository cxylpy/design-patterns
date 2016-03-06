package com.lonphy.commandpattern.example5;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Camera extends JPanel{
	private String name;
	private Icon imageIcon;
	private JLabel label;
	public Camera() {
		super();
		label = new JLabel("我是摄像头");
		add(label);
	}
	public void on() {
		label.setIcon(new ImageIcon("camera_on.png"));
	}
	public void off() {
		label.setIcon(new ImageIcon("camera_off.png"));
	}
}
