package com.lonphy.bridgepattern.example2;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JLabel;

public class CCTV6 extends CCTV implements Runnable{
	private JLabel showFilm;
	private Thread thread;
	private ArrayList<String> content;
	public CCTV6(Program program) {
		this.programMaker = program;
		setLayout(new BorderLayout());
		showFilm = new JLabel("CCTV6电影频道");
		showFilm.setFont(new Font("",Font.BOLD,39));
		add(showFilm,BorderLayout.CENTER);
		thread = new Thread(this);
	}
	@Override
	public void run() {
		for(int i = 0; i < content.size(); i++) {
			showFilm.setText(content.get(i));
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void makeProgram() {
		content = programMaker.makeTVProgram();
		if(!thread.isAlive()) {
			thread = new Thread(this);
			thread.start();
		}
	}

}
