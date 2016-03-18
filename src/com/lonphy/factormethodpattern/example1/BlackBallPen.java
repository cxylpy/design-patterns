package com.lonphy.factormethodpattern.example1;

public class BlackBallPen extends BallPen{

	@Override
	public PenCore getPenCore() {
		return new BlackPenCore();
	}

}
