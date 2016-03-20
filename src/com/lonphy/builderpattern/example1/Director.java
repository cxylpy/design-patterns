package com.lonphy.builderpattern.example1;

import javax.swing.JPanel;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}
	public JPanel constructProduct() {
		builder.buildButton();
		builder.buildLabel();
		builder.buildTextField();
		return builder.getPanel();
	}
}
