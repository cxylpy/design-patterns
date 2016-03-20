package com.lonphy.builderpattern.example1;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConcreteBuilderTwo implements Builder{
	private PanelProduct panel;
	
	public ConcreteBuilderTwo() {
		super();
		panel = new PanelProduct();
	}

	@Override
	public void buildButton() {
		panel.button = new JButton("button");
	}

	@Override
	public void buildLabel() {
		panel.label = new JLabel("label");
	}

	@Override
	public void buildTextField() {
		panel.textField = new JTextField("textField");
	}

	@Override
	public JPanel getPanel() {
		panel.add(panel.textField); //与ConcreteBuilderOne顺序不同
		panel.add(panel.label);
		panel.add(panel.button);
		return panel;
	}
	
}
