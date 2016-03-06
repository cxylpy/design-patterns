package com.lonphy.commandpattern.example5;

public class OffCameraCommand implements Command{
	private Camera camera;
	
	public OffCameraCommand(Camera camera) {
		super();
		this.camera = camera;
	}

	@Override
	public void execute() {
		camera.off();
	}

	@Override
	public String getName() {
		return "关闭摄像头";
	}
	
}
