package com.lonphy.compositepattern.example2;

import java.util.Iterator;

public interface TreeComponent {
	public void add(TreeComponent node);
	public void remove(TreeComponent node);
	public TreeComponent getChild(int index);
	public Iterator<TreeComponent> getAllChildren();
	public boolean isLeaf();
	public double getWeight();
}
