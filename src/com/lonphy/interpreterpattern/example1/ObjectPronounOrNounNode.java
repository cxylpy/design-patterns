package com.lonphy.interpreterpattern.example1;

public class ObjectPronounOrNounNode implements Node {
	private String[] word = { "Me", "Him", "Tiger", "Apple" };
	private String token;
	private boolean flag;

	@Override
	public void parse(Context context) {
		token = context.nextToken();
		int i = 0;
		for (; i < word.length; i++) {
			if (token.equalsIgnoreCase(word[i])) {
				flag = true;
				break;
			}
		}
		if(i==word.length)flag=false;
	}

	@Override
	public void execute() {
		if(flag) {
			if(token.equalsIgnoreCase(word[0]))
				System.out.print("我");
			if(token.equalsIgnoreCase(word[1]))
				System.out.print("他");
			if(token.equalsIgnoreCase(word[2]))
				System.out.print("老虎");
			if(token.equalsIgnoreCase(word[3]))
				System.out.print("苹果");
		} else {
			System.out.print(token+"（不是该语言中的语句）");
		}
	}

}
