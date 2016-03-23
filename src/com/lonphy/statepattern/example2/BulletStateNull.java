package com.lonphy.statepattern.example2;

public class BulletStateNull extends State{
	private Gun gun;
	
	public BulletStateNull(Gun gun) {
		this.gun = gun;
	}

	@Override
	public void fire() {
		System.out.print("不能射出子弹");
		System.out.println("(目前是"+showStateMsg()+")");
	}

	@Override
	public void loadBullet() {
		System.out.print("装弹");
		gun.setState(gun.getStateThree());
		System.out.println("(进入"+gun.getStateThree().showStateMsg()+")");
	}

	@Override
	public String showStateMsg() {
		return "无子弹状态";
	}

}
