package com.lonphy.commandpattern.example5;

public class OnLightCommand implements Command{
	private Light light;
	
	public OnLightCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

	@Override
	public String getName() {
		return "打开照明灯";
	}

}
