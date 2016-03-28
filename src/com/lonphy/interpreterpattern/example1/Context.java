package com.lonphy.interpreterpattern.example1;

import java.util.StringTokenizer;

public class Context {
	private StringTokenizer tokenizer;
	private String token;
	public Context(String text) {
		setContext(text);
	}
	public void setContext(String text) {
		tokenizer = new StringTokenizer(text);
	}
	public String nextToken() {
		if(tokenizer.hasMoreTokens())
			token = tokenizer.nextToken();
		else 
			token = "";
		return token;
	}
}
