package com.lonphy.compositepattern.example2;

import java.util.Iterator;

public class Compute {
	public static double computeWeight(TreeComponent node)  {
		double sum = 0;
		sum+=node.getWeight();
		if(!node.isLeaf()) {
			Iterator<TreeComponent> iter = node.getAllChildren();
			while(iter.hasNext()) sum+=Compute.computeWeight(iter.next());
		}
		return sum;
	}
	
	public static double computeValue(TreeComponent node, double unit) {
		double value = 0;
		if(node.isLeaf())value+=node.getWeight()*unit;
		else {
			Iterator<TreeComponent> iter = node.getAllChildren();
			while(iter.hasNext())value += computeValue(iter.next(),unit);
		}
		return value;
	}
	
	public static String getAllChildrenName(TreeComponent node) {
		StringBuffer msg = new StringBuffer();
		msg.append(" "+node.toString());
		if(!node.isLeaf()) {
			Iterator<TreeComponent> iter = node.getAllChildren();
			while(iter.hasNext())msg.append(getAllChildrenName(iter.next()));
		}
		return new String(msg);
	}
}
