package com.lonphy.statepattern.example2;

public class BulletStateOne extends State {
	private Gun gun;

	public BulletStateOne(Gun gun) {
		this.gun = gun;
	}
	
	@Override
	public void fire() {
		System.out.print("射出最后1颗子弹");
		gun.setState(gun.getStateNull());
		System.out.println("(进入"+gun.getStateNull().showStateMsg()+")");
	}

	@Override
	public void loadBullet() {
		System.out.println("无法装弹");
	}

	@Override
	public String showStateMsg() {
		return "1颗子弹状态";
	}

}
