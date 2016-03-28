package com.lonphy.visitorpattern.test;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

import com.lonphy.visitorpattern.example2.ArmyVisitor;
import com.lonphy.visitorpattern.example2.FactoryVisitor;
import com.lonphy.visitorpattern.example2.Man;
import com.lonphy.visitorpattern.example2.Person;
import com.lonphy.visitorpattern.example2.Visitor;
import com.lonphy.visitorpattern.example2.Woman;

public class Example2Test {
	@Test
	public void testMain() {
		Visitor army = new ArmyVisitor();
		Visitor factory = new FactoryVisitor();
		ArrayList<Person> personList = new ArrayList<>();
		personList.add(new Man("张三", 1.56, 1.2));
		personList.add(new Man("李强", 1.76, 1.5));
		personList.add(new Man("张军", 1.86, 1.3));
		personList.add(new Woman("江萍萍",1.62,1.2,67));
		personList.add(new Woman("孙丽娟",1.67,1.5,70));
		personList.add(new Woman("刘小花",1.42,0.9,70));
		Iterator<Person> iter = personList.iterator();
		while(iter.hasNext()) {
			iter.next().accept(army);
			iter.next().accept(factory);
		}
	}
}
