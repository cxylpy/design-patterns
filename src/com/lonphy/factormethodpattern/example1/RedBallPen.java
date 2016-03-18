package com.lonphy.factormethodpattern.example1;

public class RedBallPen extends BallPen {

	@Override
	public PenCore getPenCore() {
		return new RedPenCore();
	}

}
