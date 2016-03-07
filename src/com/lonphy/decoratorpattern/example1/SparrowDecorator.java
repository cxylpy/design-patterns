package com.lonphy.decoratorpattern.example1;

public class SparrowDecorator extends Decorator{
	public final int DISTANCE = 50;
	
	public SparrowDecorator() {
		super();
	}

	public SparrowDecorator(Bird bird) {
		super(bird);
	}

	@Override
	public int fly() {
		return bird.fly()+DISTANCE;
	}
}
