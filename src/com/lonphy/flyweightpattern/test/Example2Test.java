package com.lonphy.flyweightpattern.test;

import org.junit.Test;

import com.lonphy.flyweightpattern.example2.Compound;
import com.lonphy.flyweightpattern.example2.Element;
import com.lonphy.flyweightpattern.example2.ElementFactory;

public class Example2Test {
	@Test
	public void testMain() {
		ElementFactory factory = ElementFactory.getFactory();
		String key = "CO",name;
		int number1,number2;
		Element element = factory.getElement(key);
		number1 = 1;
		number2 = 2;
		name = "二氧化碳";
		Compound compound = new Compound(element,name,number1,number2);
		compound.printMsg();
		number1 = 1;
		number2 = 1;
		name = "一氧化碳";
		compound = new Compound(element, name, number1, number2);
		compound.printMsg();
		key = "HO";
		element = factory.getElement(key);
		number1 = 2;
		number2 = 1;
		name = "水";
		compound = new Compound(element,name,number1,number2);
		compound.printMsg();
		number1 = 2;
		number2 = 2;
		name = "过氧化氢";
		compound = new Compound(element,name,number1,number2);
		compound.printMsg();
		
	}
}
