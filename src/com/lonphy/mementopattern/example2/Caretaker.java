package com.lonphy.mementopattern.example2;

import java.util.Stack;

public class Caretaker {
	Stack<Memento> stack;

	public Caretaker() {
		stack = new Stack<>();
	}

	public Memento getMemento() {
		if (!stack.isEmpty()) {
			return stack.pop();
		}
		return null;
	}
	public void saveMemento(Memento memento) {
		stack.push(memento);
	}
}
