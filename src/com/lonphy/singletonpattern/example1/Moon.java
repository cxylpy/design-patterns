package com.lonphy.singletonpattern.example1;

public class Moon {
	private static Moon uniqueMoon;
	private double radius;
	private double distanceToEarth;
	private Moon() {
		uniqueMoon = this;
		radius = 1738;
		distanceToEarth = 363300;
	}
	public static synchronized Moon getMoon() {
		if(uniqueMoon==null) uniqueMoon = new Moon();
		return uniqueMoon;
	}
	public String show() {
		String s = "月亮的半径是"+radius+"km,距地球是"+distanceToEarth+"km";
		return s;
	}

}
