package com.lonphy.statepattern.example2;

public class BulletStateThree extends State{
	private Gun gun;
	public BulletStateThree(Gun gun) {
		this.gun = gun;
	}

	@Override
	public void fire() {
		System.out.print("射出1颗子弹");
		gun.setState(gun.getStateTwo());
		System.out.println("(进入"+gun.getStateTwo().showStateMsg()+")");
	}

	@Override
	public void loadBullet() {
		System.out.println("无法装弹");
	}

	@Override
	public String showStateMsg() {
		return "3颗子弹状态";
	}

}
