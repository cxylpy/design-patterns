package com.lonphy.mementopattern.example1;

import java.io.Serializable;

public class Memento implements Serializable{
	private long state;

	long getState() {
		return state;
	}

	void setState(long state) {
		this.state = state;
	}
	
}
