package com.lonphy.strategypattern.test;

import org.junit.Test;

import com.lonphy.strategypattern.example1.ComputableStrategy;
import com.lonphy.strategypattern.example1.GymnasticsGame;
import com.lonphy.strategypattern.example1.StrategyOne;
import com.lonphy.strategypattern.example1.StrategyThree;
import com.lonphy.strategypattern.example1.StrategyTwo;

public class Example1Test {
	@Test
	public void testMain() {
		GymnasticsGame game = new GymnasticsGame();
		ComputableStrategy strategy1 = new StrategyOne();
		ComputableStrategy strategy2 = new StrategyTwo();
		ComputableStrategy strategy3 = new StrategyThree();
		double a[] = {9.12,9.25,8.87,9.99,6.99,7.88};
		double b[] = {9.15,9.26,8.97,9.89,6.97,7.89};
		game.setStrategy(strategy1);
		System.out.println("使用算术平均值方案：");
		System.out.printf("%s 最后得分： %5.3f \n", "张三",game.getPersonScore(a));
		System.out.printf("%s 最后得分： %5.3f \n", "李四",game.getPersonScore(b));
		game.setStrategy(strategy2);
		System.out.println("使用几何平均值方案：");
		System.out.printf("%s 最后得分： %5.3f \n", "张三",game.getPersonScore(a));
		System.out.printf("%s 最后得分： %5.3f \n", "李四",game.getPersonScore(b));
		game.setStrategy(strategy3);
		System.out.println("使用（去掉最高、最低）算术平均值方案：");
		System.out.printf("%s 最后得分： %5.3f \n", "张三",game.getPersonScore(a));
		System.out.printf("%s 最后得分： %5.3f \n", "李四",game.getPersonScore(b));
	}
}
