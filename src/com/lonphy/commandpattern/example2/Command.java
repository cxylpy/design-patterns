package com.lonphy.commandpattern.example2;

public interface Command {
	public abstract void execute(String name);
	public abstract void undo();
}
