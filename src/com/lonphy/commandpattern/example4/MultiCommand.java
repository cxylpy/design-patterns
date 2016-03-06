package com.lonphy.commandpattern.example4;

public class MultiCommand implements Command {
	private ShowMultForm showMultForm;
	@Override
	public void execute() {
		showMultForm.show();
	}

	@Override
	public String getName() {
		return "显示乘法表";
	}

	public MultiCommand(ShowMultForm showMultForm) {
		super();
		this.showMultForm = showMultForm;
	}
	
}
