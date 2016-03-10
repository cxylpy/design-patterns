package com.lonphy.adapterpattern.example3;

import java.util.Enumeration;
import java.util.Vector;

public class BookNameList {
	private Vector<String> vector;
	public BookNameList() {
		vector = new Vector<>();
	}
	public void setBookNames() {
		vector.add("Java程序设计");
		vector.add("J2ME程序设计");
		vector.add("XML程序设计");
		vector.add("JSP程序设计");
	}
	public Enumeration getEnumeration() {
		return vector.elements();
	}
}
