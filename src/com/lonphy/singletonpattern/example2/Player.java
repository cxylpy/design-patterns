package com.lonphy.singletonpattern.example2;

import javax.swing.JButton;
import javax.swing.JTextField;

public class Player extends Thread{
	private int maxDistance;
	private int stopTime,step;
	private JButton btn;
	private JTextField jtf;
	private Champion champion;
	public Player(int maxDistance, int stopTime, int step, JButton btn,
			JTextField jtf) {
		this.maxDistance = maxDistance;
		this.stopTime = stopTime;
		this.step = step;
		this.btn = btn;
		this.jtf = jtf;
	}
	
	@Override
	public void run() {
		while(true) {
			int x = btn.getBounds().x;
			int y = btn.getBounds().y;
			if(x+btn.getBounds().width>=maxDistance) {
				champion = Champion.getChampion(btn.getText());
				jtf.setText(champion.getMsg());
				return;
			}
			x+=step;
			btn.setLocation(x, y);
			try {
				sleep(stopTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
