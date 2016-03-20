package com.lonphy.prototypepattern.example3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Goat implements Prototype,Serializable{
	private StringBuffer color;
	
	public StringBuffer getColor() {
		return color;
	}

	public void setColor(StringBuffer color) {
		this.color = color;
	}
	
	@Override
	public Object cloneMe() throws CloneNotSupportedException {
		Object o = null;
		try {
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(baos);
			oos.writeObject(this);
			ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bais);
			o = ois.readObject();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return o;
	}

}
