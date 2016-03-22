package com.lonphy.compositepattern.example2;

import java.util.Iterator;
import java.util.LinkedList;

public class TreeBody implements TreeComponent{
	private LinkedList<TreeComponent> list;
	private double weight;
	private String name;
	
	public TreeBody(double weight, String name) {
		this.weight = weight;
		this.name = name;
		list = new LinkedList<>();
	}
	@Override
	public void add(TreeComponent node) {
		list.add(node);
	}

	@Override
	public void remove(TreeComponent node) {
		list.remove(node);
	}

	@Override
	public TreeComponent getChild(int index) {
		return list.get(index);
	}

	@Override
	public Iterator<TreeComponent> getAllChildren() {
		return list.iterator();
	}

	@Override
	public boolean isLeaf() {
		return false;
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
