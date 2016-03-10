package com.lonphy.adapterpattern.example1;

public class Wash implements ThreeHoleSocket{
	private String name;
	public Wash(String name) {
		this.name = name;
	}
	@Override
	public void connect() {
		System.out.println(name+"开始洗衣物。");
	}
}
