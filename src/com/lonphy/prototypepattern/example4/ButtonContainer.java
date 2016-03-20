package com.lonphy.prototypepattern.example4;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class ButtonContainer extends JPanel implements CloneContainer,ActionListener{
	private JButton[] button;
	public ButtonContainer() {
		button = new JButton[25];
		setLayout(new GridLayout(5,5));
		for(int i = 0; i < 25; i++) {
			button[i] = new JButton();
			add(button[i]);
			button[i].addActionListener(this);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		Color newColor = JColorChooser.showDialog(null, "", b.getBackground());
		if(newColor!=null)b.setBackground(newColor);
	}

	@Override
	public Object cloneContainer() {
		Object o = null;
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			o = ois.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return o;
	}

}
