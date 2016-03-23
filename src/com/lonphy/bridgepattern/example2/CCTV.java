package com.lonphy.bridgepattern.example2;

import javax.swing.JPanel;

public abstract class CCTV extends JPanel{
	protected Program programMaker;
	public abstract void makeProgram();
}
