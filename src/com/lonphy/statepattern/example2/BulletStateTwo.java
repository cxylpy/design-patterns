package com.lonphy.statepattern.example2;

public class BulletStateTwo extends State{
	private Gun gun;
	
	public BulletStateTwo(Gun gun) {
		this.gun = gun;
	}

	@Override
	public void fire() {
		System.out.print("射出1颗子弹");
		gun.setState(gun.getStateOne());
		System.out.println("(进入"+gun.getStateOne().showStateMsg()+")");
	}

	@Override
	public void loadBullet() {
		System.out.println("无法装弹");
	}

	@Override
	public String showStateMsg() {
		return "2颗子弹状态";
	}

}
