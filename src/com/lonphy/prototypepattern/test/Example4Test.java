package com.lonphy.prototypepattern.test;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import com.lonphy.prototypepattern.example4.ButtonContainer;

public class Example4Test extends JFrame implements ActionListener{
	private JTabbedPane jtp;
	private ButtonContainer bc;
	private JButton add,del;
	public Example4Test() {
		add = new JButton("复制窗口中当前容器");
		del = new JButton("删除窗口中当前容器");
		add.addActionListener(this);
		del.addActionListener(this);
		JPanel pSouth = new JPanel();
		pSouth.add(add);
		pSouth.add(del);
		add(pSouth,BorderLayout.SOUTH);
		bc = new ButtonContainer();
		jtp = new JTabbedPane(JTabbedPane.LEFT);
		add(jtp,BorderLayout.CENTER);
		jtp.add("原型容器",bc);
		setBounds(100,100,500,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==add) {
			int index = jtp.getSelectedIndex();
			ButtonContainer container = (ButtonContainer) jtp.getComponentAt(index);
			ButtonContainer containerCopy = (ButtonContainer) container.cloneContainer();
			jtp.add("复制的容器",containerCopy);
		} else {
			int index = jtp.getSelectedIndex();
			jtp.remove(index);
		}
	}
	public static void main(String[] args) {
		new Example4Test();
	}
	
}
