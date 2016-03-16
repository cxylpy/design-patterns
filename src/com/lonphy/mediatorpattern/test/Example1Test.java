package com.lonphy.mediatorpattern.test;

import org.junit.Test;

import com.lonphy.mediatorpattern.example1.ColleagueA;
import com.lonphy.mediatorpattern.example1.ColleagueB;
import com.lonphy.mediatorpattern.example1.ColleagueC;
import com.lonphy.mediatorpattern.example1.ConcreteMediator;

public class Example1Test {
	@Test
	public void testMain() {
		ConcreteMediator mediator = new ConcreteMediator();
		ColleagueA colleagueA = new ColleagueA(mediator);
		ColleagueB colleagueB = new ColleagueB(mediator);
		ColleagueC colleagueC = new ColleagueC(mediator);
		colleagueA.setName("A国");
		colleagueB.setName("B国");
		colleagueC.setName("C国");
		String[] msgA = {"要求归还曾抢夺的100斤土豆","要求归还曾抢夺的20头牛"};
		String[] msgB = {"要求归还曾抢夺的10只公鸡","要求归还曾抢夺的15匹马"};
		String[] msgC = {"要求归还曾抢夺的300斤小麦","要求归还曾抢夺的50头驴"};
		colleagueA.giveMsg(msgA);
		colleagueB.giveMsg(msgB);
		colleagueC.giveMsg(msgC);
	}
}
