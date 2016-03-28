package com.lonphy.mementopattern.example1;

import java.io.Serializable;

public class Memento implements Serializable{
	private long state;

	public long getState() {
		return state;
	}

	public void setState(long state) {
		this.state = state;
	}
	
}
