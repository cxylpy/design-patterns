package com.lonphy.strategypattern.example1;

public class GymnasticsGame {
	ComputableStrategy strategy;
	public void setStrategy(ComputableStrategy strategy) {
		this.strategy = strategy;
	}
	public double getPersonScore(double a[]) {
		if(strategy!=null)return strategy.computeScore(a);
		return 0;
	}
}
