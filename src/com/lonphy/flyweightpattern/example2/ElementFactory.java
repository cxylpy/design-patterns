package com.lonphy.flyweightpattern.example2;

import java.util.HashMap;

public class ElementFactory {
	private HashMap<String,Element> map;
	private static ElementFactory factory = new ElementFactory();
	private ElementFactory() {
		map = new HashMap<>();
	}
	public static ElementFactory getFactory() {
		return factory;
	}
	public synchronized Element getElement(String key) {
		if(map.containsKey(key))return map.get(key);
		char elementOne='\0',elementTwo='\0';
		elementOne = key.charAt(0);
		elementTwo = key.charAt(1);
		Element element = new TwoElement(elementOne, elementTwo);
		map.put(key, element);
		return element;
	}
}
