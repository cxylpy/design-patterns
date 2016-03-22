package com.lonphy.compositepattern.example2;

import java.util.Iterator;

public class Apple implements TreeComponent{
	private double weight;
	private String name;
	
	public Apple(double weight, String name) {
		this.weight = weight;
		this.name = name;
	}

	@Override
	public void add(TreeComponent node) {
		
	}

	@Override
	public void remove(TreeComponent node) {
		
	}

	@Override
	public TreeComponent getChild(int index) {
		return null;
	}

	@Override
	public Iterator<TreeComponent> getAllChildren() {
		return null;
	}

	@Override
	public boolean isLeaf() {
		return true;
	}

	@Override
	public double getWeight() {
		return weight;
	}
	@Override
	public String toString() {
		return name;
	}
}
