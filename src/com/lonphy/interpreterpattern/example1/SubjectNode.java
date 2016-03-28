package com.lonphy.interpreterpattern.example1;

public class SubjectNode implements Node{
	private Node node;
	@Override
	public void parse(Context context) {
		node = new SubjectPronounOrNounNode();
		node.parse(context);
	}

	@Override
	public void execute() {
		node.execute();
	}

}
