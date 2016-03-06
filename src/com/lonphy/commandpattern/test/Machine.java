package com.lonphy.commandpattern.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.lonphy.commandpattern.example5.Camera;
import com.lonphy.commandpattern.example5.Invoke;
import com.lonphy.commandpattern.example5.Light;
import com.lonphy.commandpattern.example5.OffCameraCommand;
import com.lonphy.commandpattern.example5.OffLightCommand;
import com.lonphy.commandpattern.example5.OnCameraCommand;
import com.lonphy.commandpattern.example5.OnLightCommand;

public class Machine extends JFrame{
	Invoke requestOnCamera,requestOffCamera,requestOnLight,requestOffLight;
	Camera camera;
	Light light;
	public Machine() throws HeadlessException {
		super();
		setTitle("小家电");
		requestOnCamera = new Invoke();
		requestOffCamera = new Invoke();
		camera = new Camera();
		light = new Light();
		requestOnCamera.setCommand(new OnCameraCommand(camera));
		requestOffCamera.setCommand(new OffCameraCommand(camera));
		requestOnLight = new Invoke();
		requestOffLight = new Invoke();
		requestOnLight.setCommand(new OnLightCommand(light));
		requestOffLight.setCommand(new OffLightCommand(light));
		initPosition();
		setSize(1000,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	private void initPosition() {
		JPanel pSouth = new JPanel();
		pSouth.add(requestOnCamera.getButton());
		pSouth.add(requestOffCamera.getButton());
		pSouth.add(requestOnLight.getButton());
		pSouth.add(requestOffLight.getButton());
		add(pSouth,BorderLayout.SOUTH);
		JPanel pNorth = new JPanel();
		pNorth.add(light);
		add(pNorth,BorderLayout.NORTH);
		JPanel pCenter = new JPanel();
		pCenter.setBackground(Color.yellow);
		pCenter.add(camera);
		add(pCenter,BorderLayout.CENTER);
	}
	public static void main(String[] args) {
		Machine m = new Machine();
	}
}
