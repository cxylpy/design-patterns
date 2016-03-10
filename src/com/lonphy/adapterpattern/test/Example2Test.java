package com.lonphy.adapterpattern.test;

import org.junit.Test;

import com.lonphy.adapterpattern.example1.TV;
import com.lonphy.adapterpattern.example1.ThreeHoleSocket;
import com.lonphy.adapterpattern.example1.TwoHoleSocket;
import com.lonphy.adapterpattern.example1.Wash;
import com.lonphy.adapterpattern.example2.ThreeAndTwoHoleSocketAdapter;

public class Example2Test {
	@Test
	public void testMain() {
		Wash wash = new Wash("格力洗衣机");
		TV tv = new TV("乐视电视");
		ThreeAndTwoHoleSocketAdapter tvAdapter = new ThreeAndTwoHoleSocketAdapter(tv);
		tvAdapter.connect();
		ThreeAndTwoHoleSocketAdapter washAdapter = new ThreeAndTwoHoleSocketAdapter(wash);
		washAdapter.connect();
	}
}
