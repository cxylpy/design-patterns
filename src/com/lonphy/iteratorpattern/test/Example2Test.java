package com.lonphy.iteratorpattern.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

import org.junit.Test;

public class Example2Test {
	@Test
	public void testMain() {
		LinkedList<String> list = new LinkedList<>();
		for(int i = 0; i <= 60096; i++) {
			list.add("speed"+i);
		}
		Iterator<String> iterator = list.iterator();
		long startTime = System.currentTimeMillis();
		while(iterator.hasNext()) {
			String t = iterator.next();
		}
		long  endTime = System.currentTimeMillis();
		long result = endTime - startTime;
		System.out.println("使用迭代器遍历集合所用时间："+result+"毫秒");
		startTime = System.currentTimeMillis();
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
		}
		endTime = System.currentTimeMillis();
		result = endTime - startTime;
		System.out.println("使用get方法遍历集合所用时间："+result+"毫秒");
	}
}
