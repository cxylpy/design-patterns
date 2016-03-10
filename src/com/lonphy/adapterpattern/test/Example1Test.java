package com.lonphy.adapterpattern.test;

import org.junit.Test;

import com.lonphy.adapterpattern.example1.TV;
import com.lonphy.adapterpattern.example1.ThreeHoleSocketAdapter;
import com.lonphy.adapterpattern.example1.Wash;

public class Example1Test {
	@Test
	public void testMain() {
		Wash wash = new Wash("格力洗衣机");
		TV tv = new TV("乐视电视");
		ThreeHoleSocketAdapter adapter = new ThreeHoleSocketAdapter(tv);
		wash.connect();
		//插在适配器上的电视
		adapter.connect();
	}
}
