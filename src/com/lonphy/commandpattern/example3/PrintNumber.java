package com.lonphy.commandpattern.example3;

public class PrintNumber {
	int n;

	public PrintNumber(int n) {
		super();
		this.n = n;
	}
	public void printEvenNumber() {
		for(int i = 0; i <= n; i++) {
			if(i%2==0)System.out.print(" "+i);
		}
	}
	public void printOddNumber() {
		for(int i = 0; i <= n; i++) {
			if(i%2==1)System.out.print(" "+i);
		}
	}
}
