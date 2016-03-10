package com.lonphy.adapterpattern.example1;

public class TV implements TwoHoleSocket{
	private String name;
	
	public TV(String name) {
		this.name = name;
	}

	@Override
	public void connect() {
		System.out.println(name+"开始播放节目。");
	}

}
