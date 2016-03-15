package com.lonphy.iteratorpattern.test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Test;

public class Example1Test {
	@Test
	public void testMain() {
		int n = 20;
		int sum = 0;
		Collection<RMB> set = new HashSet<RMB>();// 集合对象
		for (int i = 1; i <= n; i++) {
			if (i == n / 2 || i == n / 5 || i == n / 6)
				set.add(new RMB(100, false));
			else
				set.add(new RMB(100, true));
		}
		Iterator<RMB> iterator = set.iterator();// 迭代器
		int fake = 1, real = 1;
		System.out.println("保险箱共有" + set.size() + "张人民币");
		int k = 0;
		while (iterator.hasNext()) {
			RMB next = iterator.next();
			k++;
			if (!next.isReal()) {
				System.out.println("第" + k + "张是假币，应被销毁");
				iterator.remove();
				k++;
			} else {
				sum += next.getValue();
			}
		}
		System.out.println("保险箱现有真人民币"+set.size()+"张，总价值是："+sum+"元");
	}

	class RMB {
		int value;
		private boolean isReal;

		public RMB(int value, boolean isReal) {
			this.value = value;
			this.isReal = isReal;
		}

		public int getValue() {
			return value;
		}

		public boolean isReal() {
			return isReal;
		}

	}
}
