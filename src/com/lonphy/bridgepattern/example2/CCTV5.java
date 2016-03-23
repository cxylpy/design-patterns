package com.lonphy.bridgepattern.example2;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.border.Border;

public class CCTV5 extends CCTV implements Runnable {
	private JLabel showFilm;
	private Thread thread;
	private ArrayList<String> content;

	public CCTV5(Program program) {
		this.programMaker = program;
		setLayout(new BorderLayout());
		showFilm = new JLabel("CCTV体育频道");
		showFilm.setFont(new Font("", Font.BOLD, 39));
		add(showFilm, BorderLayout.CENTER);
		thread = new Thread(this);
	}

	@Override
	public void run() {
		for (int i = 0; i < content.size(); i++) {
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
		if (!thread.isAlive()) {
			thread = new Thread(this);
			thread.start();
		}
	}

}
