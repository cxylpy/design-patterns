package com.lonphy.commandpattern.example5;

public class OnCameraCommand implements Command{
	private Camera camera;
	
	public OnCameraCommand(Camera camera) {
		super();
		this.camera = camera;
	}

	@Override
	public void execute() {
		camera.on();
	}

	@Override
	public String getName() {
		return "打开摄像头";
	}
	
}
