package com.lonphy.commandpattern.example5;

public class OffLightCommand implements Command{
	Light light;
	
	public OffLightCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public String getName() {
		return "关闭照明灯";
	}

}
