package com.lonphy.adapterpattern.example3;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter implements Iterator{
	Enumeration bookEnum;
	
	public IteratorAdapter(Enumeration bookEnum) {
		this.bookEnum = bookEnum;
	}

	@Override
	public boolean hasNext() {
		return bookEnum.hasMoreElements();
	}

	@Override
	public Object next() {
		return bookEnum.nextElement();
	}

	@Override
	public void remove() {
		System.out.println("枚举器没有删除集合元素的方法");
	}

}
