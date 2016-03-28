package com.lonphy.flyweightpattern.example1;

import java.util.HashMap;

public class FlyweightFactory {
	private HashMap<String,Flyweight> hash;
	private static FlyweightFactory factory = new FlyweightFactory();
	private FlyweightFactory() {
		hash = new HashMap<>();
	}
	public static FlyweightFactory getFactory() {
		return factory;
	}
	public synchronized Flyweight getFlyweight(String key) {
		if(hash.containsKey(key))
			return hash.get(key);
		double width = 0, height = 0, length = 0;
		String[] str = key.split("#");
		width = Double.parseDouble(str[0]);
		height = Double.parseDouble(str[1]);
		length = Double.parseDouble(str[2]);
		Flyweight fw = new ConcreteFlyweight(width,height,length);
		hash.put(key, fw);
		return fw;
	}
}
