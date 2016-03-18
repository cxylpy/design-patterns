package com.lonphy.factormethodpattern.example1;

public abstract class BallPen {
	public BallPen() {
		System.out.println("生产了一只装有"+getPenCore().getColor()+"笔芯的圆珠笔");
	}
	public abstract PenCore getPenCore();
}
