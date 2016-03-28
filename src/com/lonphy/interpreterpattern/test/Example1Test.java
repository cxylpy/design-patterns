package com.lonphy.interpreterpattern.test;

import org.junit.Test;

import com.lonphy.interpreterpattern.example1.Context;
import com.lonphy.interpreterpattern.example1.Node;
import com.lonphy.interpreterpattern.example1.SentenceNode;

public class Example1Test {
	@Test
	public void testMain() {
		String text = "Teacher beat tiger";
		Context context = new Context(text);
		Node node = new SentenceNode();
		node.parse(context);
		node.execute();
		text = "You eat apple";
		context.setContext(text);
		System.out.println();
		node.parse(context);
		node.execute();
		text = "you look him";
		context.setContext(text);
		System.out.println();
		node.parse(context);
		node.execute();
	}
}
