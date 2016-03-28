package com.lonphy.mementopattern.example2;

import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class UnicodeLabel extends JLabel{
	private Integer m;
	public UnicodeLabel() {
		setFont(new Font("宋体",Font.BOLD,100));
		setHorizontalAlignment(SwingConstants.CENTER);
		m = new Integer(19968);
		setText(""+(char)m.intValue());
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				if(e.getModifiers()==InputEvent.BUTTON1_MASK) {
					m=(int) (Math.random()*1000+19968);
					setText(""+(char)m.intValue());
				}
			}
		});
	}
	public Memento createMemento() {
		Memento mem = new Memento();
		mem.setState(m);
		return mem;
	}
	public void restoreFromMemento(Memento mem) {
		m=mem.getState();
		if(m!=null)
			setText(""+(char)m.intValue());
	}
}
