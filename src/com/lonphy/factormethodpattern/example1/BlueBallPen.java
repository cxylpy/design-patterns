package com.lonphy.factormethodpattern.example1;

public class BlueBallPen extends BallPen{

	@Override
	public PenCore getPenCore() {
		return new BluePenCore();
	}

}
