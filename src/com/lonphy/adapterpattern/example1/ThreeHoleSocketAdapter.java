package com.lonphy.adapterpattern.example1;

public class ThreeHoleSocketAdapter implements ThreeHoleSocket{
	TwoHoleSocket socket;
	
	public ThreeHoleSocketAdapter(TwoHoleSocket socket) {
		this.socket = socket;
	}

	@Override
	public void connect() {
		makeSomeChanges();
		socket.connect();
	}

	private void makeSomeChanges() {
		System.out.println("适配器让两个插孔的插头可以使用三相插座");
	}

}
