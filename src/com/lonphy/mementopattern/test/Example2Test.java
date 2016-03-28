package com.lonphy.mementopattern.test;

import java.awt.BorderLayout;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.lonphy.mementopattern.example2.Caretaker;
import com.lonphy.mementopattern.example2.Memento;
import com.lonphy.mementopattern.example2.UnicodeLabel;

public class Example2Test extends JFrame implements MouseListener{
	private UnicodeLabel label;
	private Caretaker caretaker;
	public Example2Test() {
		label = new UnicodeLabel();
		label.addMouseListener(this);
		add(new JLabel("单击左键显示一个汉字，单击右键撤销"),BorderLayout.NORTH);
		add(label,BorderLayout.CENTER);
		caretaker = new Caretaker();
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if(e.getModifiers()==InputEvent.BUTTON1_MASK) {
			caretaker.saveMemento(label.createMemento());
		}
		if(e.getModifiers()==InputEvent.BUTTON3_MASK) {
			Memento memento = caretaker.getMemento();
			if(memento!=null) label.restoreFromMemento(memento);
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Example2Test test = new Example2Test();
		test.setBounds(10, 10, 300, 300);
		test.setVisible(true);
		test.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
}
