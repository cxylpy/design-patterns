package com.lonphy.factormethodpattern.test;

import org.junit.Test;

import com.lonphy.factormethodpattern.example1.BallPen;
import com.lonphy.factormethodpattern.example1.BlackBallPen;
import com.lonphy.factormethodpattern.example1.BlueBallPen;
import com.lonphy.factormethodpattern.example1.PenCore;
import com.lonphy.factormethodpattern.example1.RedBallPen;

public class Example1Test {
	@Test
	public void testMain() {
		PenCore penCore;
		BallPen ballPen = new BlueBallPen();
		penCore = ballPen.getPenCore();
		penCore.writeWord("你好，很高兴认识你");
		ballPen = new RedBallPen();
		penCore = ballPen.getPenCore();
		penCore.writeWord("How are you?");
		ballPen = new BlackBallPen();
		penCore = ballPen.getPenCore();
		penCore.writeWord("nice to meet you");
	}
}
