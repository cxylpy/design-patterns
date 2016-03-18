package com.lonphy.factormethodpattern.test;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import org.junit.Test;

public class Example2Test {
	@Test
	public void testMain() {
		Collection<Integer> list = new LinkedList<>();
		for(int i = 1; i < 10; i++) {
			list.add(i);
		}
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
