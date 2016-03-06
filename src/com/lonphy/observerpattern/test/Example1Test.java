package com.lonphy.observerpattern.test;

import org.junit.Test;

import com.lonphy.observerpattern.example1.OverseaStudent;
import com.lonphy.observerpattern.example1.SeekJobCenter;
import com.lonphy.observerpattern.example1.UniversityStudent;

public class Example1Test {
	@Test
	public void testMain() {
		SeekJobCenter center = new SeekJobCenter();
		UniversityStudent zhangSan = new UniversityStudent(center, "A.txt");
		OverseaStudent liSi = new OverseaStudent(center, "B.txt");
		center.giveNewMessage("AA公司需要10个java程序员。");
		center.notifyObservers();
		center.giveNewMessage("AA公司需要8个动画设计师。");
		center.notifyObservers();
		center.giveNewMessage("BB公司需要9个电工。");
		center.notifyObservers();
		//任务不是新的，不会更新
		center.giveNewMessage("BB公司需要9个电工。");
		center.notifyObservers();
	}
}
