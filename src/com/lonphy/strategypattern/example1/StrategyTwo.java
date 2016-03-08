package com.lonphy.strategypattern.example1;

public class StrategyTwo implements ComputableStrategy{

	@Override
	public double computeScore(double[] a) {
		double score=0,multi=1;
		for(int i = 0; i < a.length;i++) {
			multi*=a[i];
		}
		score=Math.pow(multi, 1./a.length);
		return score;
	}

}
