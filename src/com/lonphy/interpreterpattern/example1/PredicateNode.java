package com.lonphy.interpreterpattern.example1;

public class PredicateNode implements Node{
	private Node verbNode,objectNode;
	@Override
	public void parse(Context context) {
		verbNode = new VerbNode();
		objectNode = new ObjectPronounOrNounNode();
		verbNode.parse(context);
		objectNode.parse(context);
	}

	@Override
	public void execute() {
		verbNode.execute();
		objectNode.execute();
	}

}
