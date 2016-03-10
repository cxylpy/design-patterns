package com.lonphy.adapterpattern.example2;

import com.lonphy.adapterpattern.example1.ThreeHoleSocket;
import com.lonphy.adapterpattern.example1.TwoHoleSocket;

public class ThreeAndTwoHoleSocketAdapter{
	private Object machine;
	/**
	 * 双向适配器，既可以适配双相插座，又可以适配三相插座
	 */
	public ThreeAndTwoHoleSocketAdapter(Object machine) {
		this.machine = machine;
	}

	public void connect() {
		if(machine instanceof ThreeHoleSocket) {
			makeThree2TwoSocketChange();
			((ThreeHoleSocket)machine).connect();
		} 
		if(machine instanceof TwoHoleSocket){
			makeTwo2ThreeSocketChange();
			((TwoHoleSocket)machine).connect();
		}
	}
	
	private void makeThree2TwoSocketChange() {
		System.out.println("三相插座-》双相插座适配器");
	}
	private void makeTwo2ThreeSocketChange() {
		System.out.println("双相插座-》三相插座适配器");
	}
	
}
