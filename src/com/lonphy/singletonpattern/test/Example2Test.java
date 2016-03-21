package com.lonphy.singletonpattern.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import com.lonphy.singletonpattern.example2.Champion;
import com.lonphy.singletonpattern.example2.Player;

public class Example2Test extends JFrame implements ActionListener{
	private JButton startBtn;
	private Player playerOne,playerTwo,playerThree;
	private JButton btnOne,btnTwo,btnThree;
	private JTextField jtf;
	private int width = 60, height = 28, maxDistance = 460;
	public Example2Test() {
		setLayout(null);
		startBtn = new JButton("开始比赛");
		startBtn.addActionListener(this);
		add(startBtn);
		startBtn.setBounds(200,30,90,20);
		jtf = new JTextField("冠军会是谁呢？");
		jtf.setEditable(false);
		add(jtf);
		jtf.setBounds(300, 30, 120, 20);
		jtf.setBackground(Color.orange);
		jtf.setFont(new Font("隶书",Font.BOLD,16));
		btnOne = new JButton("苏快");
		btnOne.setSize(60,30);
		btnOne.setBackground(Color.yellow);
		playerOne = new Player(maxDistance, 18, 2, btnOne, jtf);
		btnTwo = new JButton("胡跑");
		btnTwo.setSize(65, 30);
		btnTwo.setBackground(Color.cyan);
		playerTwo = new Player(maxDistance,19,2,btnTwo,jtf);
		btnThree = new JButton("李奔");
		btnThree.setSize(62,30);
		btnThree.setBackground(Color.green);
		playerThree = new Player(maxDistance, 21, 2, btnThree, jtf);
		initPosition();
		setBounds(100, 100, 600, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	private void initPosition() {
		Champion.initChampion();
		jtf.setText("冠军会是谁呢？");
		repaint();
		remove(btnOne);
		remove(btnTwo);
		remove(btnThree);
		add(btnOne);
		add(btnTwo);
		add(btnThree);
		btnOne.setLocation(1, 60);
		btnTwo.setLocation(1, 60+height+2);
		btnThree.setLocation(1,60+2*height+4);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		boolean alive = playerOne.isAlive()||playerTwo.isAlive()||playerThree.isAlive();
		if(!alive) {
			initPosition();
			playerOne = new Player(maxDistance, (int)(Math.random()*2)+19, 2, btnOne, jtf);
			playerTwo = new Player(maxDistance, (int)(Math.random()*2)+19, 2, btnTwo, jtf);
			playerThree = new Player(maxDistance, (int)(Math.random()*2)+19, 2, btnThree, jtf);
		}
		playerOne.start();
		playerTwo.start();
		playerThree.start();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawLine(maxDistance,0,maxDistance,maxDistance);
	}
	public static void main(String[] args) {
		new Example2Test();
	}
}
