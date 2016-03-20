package com.lonphy.builderpattern.example1;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConcreteBuilderOne implements Builder{
	private PanelProduct panel;
	
	public ConcreteBuilderOne() {
		super();
		panel = new PanelProduct();
	}

	@Override
	public void buildButton() {
		panel.button = new JButton("按钮");
	}

	@Override
	public void buildLabel() {
		panel.label = new JLabel("标签");
	}

	@Override
	public void buildTextField() {
		panel.textField = new JTextField("文本框");
	}

	@Override
	public JPanel getPanel() {
		panel.add(panel.button);
		panel.add(panel.label);
		panel.add(panel.textField);
		return panel;
	}
	
}
