package com.lonphy.decoratorpattern.example1;

public abstract class Decorator extends Bird{
	protected Bird bird;

	public Decorator(Bird bird) {
		this.bird = bird;
	}

	public Decorator() {
		super();
	}
	
}
