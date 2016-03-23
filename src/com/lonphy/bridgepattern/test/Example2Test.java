package com.lonphy.bridgepattern.test;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.lonphy.bridgepattern.example2.AthleticProgram;
import com.lonphy.bridgepattern.example2.CCTV;
import com.lonphy.bridgepattern.example2.CCTV5;
import com.lonphy.bridgepattern.example2.CCTV6;
import com.lonphy.bridgepattern.example2.FilmProgram;
import com.lonphy.bridgepattern.example2.Program;

public class Example2Test extends JFrame{
	private JButton btnWatch;
	private CCTV cctv;
	private Program program;
	public Example2Test(CCTV tv, Program program) {
		this.cctv = tv;
		this.program = program;
		add(cctv,BorderLayout.CENTER);
		btnWatch = new JButton("看节目");
		add(btnWatch,BorderLayout.SOUTH);
		btnWatch.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cctv.makeProgram();
			}
		});
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		Program program = new AthleticProgram();
		CCTV cctv = new CCTV5(program);
		Example2Test test1 = new Example2Test(cctv, program);
		test1.setBounds(10,10,500,300);
		program = new FilmProgram();
		cctv = new CCTV6(program);
		Example2Test test2 = new Example2Test(cctv, program);
		test2.setBounds(520, 10, 500, 300);
	}
}
