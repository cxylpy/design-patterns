package com.lonphy.abstractfactorypattern.example2;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ShowDepositSlip extends JPanel{
	private DepositSlip slip;
	private Seal seal;
	private boolean boo;
	private JLabel label;
	private Image image;
	private JFrame frame;
	public ShowDepositSlip() {
		super();
		setLayout(null);
		setSize(200,200);
		label = new JLabel();
		add(label);
		frame = new JFrame();
		frame.add(this);
	}
	public void showDepositSlip(Bank bank, String number, String name, int money) {
		slip = bank.createDepositSlip(number, name, money);
		seal = bank.createSeal();
		image = seal.getImage();
		label.setIcon(new ImageIcon(image));
		boo = true;
		frame.setSize(200,280);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void setLocation(int a, int b) {
		frame.setLocation(a,b);
	}
	public void paintComponent(Graphics g) {
		if(boo) {
			g.drawString(slip.getBankName()+"存款凭证", 10, 20);
			g.drawString("账号："+slip.getClientNumber(), 20, 50);
			g.drawString("姓名："+slip.getClientName(), 20, 80);
			g.drawString("金额:"+slip.getAmountOfMoney(), 20, 110);
			label.setBounds(60, 120, image.getWidth(this), image.getHeight(this));
		}
	}
	
}
