package com.lonphy.interpreterpattern.example1;

public class VerbNode implements Node{
	private String[] word = {"Drink","Eat","Look","Beat"};
	private String token;
	private boolean flag;
	@Override
	public void parse(Context context) {
		token = context.nextToken();
		int i = 0;
		for(;i<word.length;i++) {
			if(token.equalsIgnoreCase(word[i])) {
				flag = true;
				break;
			}
		}
		if(i==word.length)flag = false;
	}

	@Override
	public void execute() {
		if(flag) {
			if(token.equalsIgnoreCase(word[0]))
				System.out.print("喝");
			if(token.equalsIgnoreCase(word[1]))
				System.out.print("吃");
			if(token.equalsIgnoreCase(word[2]))
				System.out.print("看");
			if(token.equalsIgnoreCase(word[3]))
				System.out.print("打");
		}else {
			System.out.print(token+"（不是该语言中的语句）");
		}
	}

}
