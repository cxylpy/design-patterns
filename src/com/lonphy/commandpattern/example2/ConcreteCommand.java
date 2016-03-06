package com.lonphy.commandpattern.example2;

import java.util.LinkedList;

public class ConcreteCommand implements Command {
	private LinkedList<String> dirNameList;
	private MakeDir makeDir;

	public ConcreteCommand(MakeDir makeDir) {
		super();
		this.makeDir = makeDir;
		dirNameList = new LinkedList<>();
	}

	@Override
	public void execute(String name) {
		makeDir.createDir(name);
		dirNameList.push(name);
	}

	@Override
	public void undo() {
		if (dirNameList.size() > 0) {
			String name = dirNameList.poll();
			makeDir.deleteDir(name);
		} else {
			System.out.println("没有需要撤销的操作");
		}
	}

}
