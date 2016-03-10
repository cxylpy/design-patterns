package com.lonphy.adapterpattern.example3;

import java.util.Iterator;
import java.util.LinkedList;

public class NewBookNameList {
	LinkedList<String> bookList;
	Iterator iterator;
	public NewBookNameList(Iterator iterator) {
		bookList = new LinkedList<>();
		this.iterator = iterator;
	}
	
	public void setBookName() {
		while(iterator.hasNext()) {
			String name=(String) iterator.next();
			bookList.add(name);
		}
	}
	
	public void getBookName() {
		Iterator<String> iter = bookList.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
}
