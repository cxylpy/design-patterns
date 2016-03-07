package com.lonphy.decoratorpattern.example2;

public abstract class Decorator extends ReadWord{
	protected ReadWord reader;

	public Decorator() {
		super();
	}

	public Decorator(ReadWord reader) {
		this.reader = reader;
	}
	
}
