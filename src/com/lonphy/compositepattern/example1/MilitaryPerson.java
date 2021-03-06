package com.lonphy.compositepattern.example1;

import java.util.Iterator;

public interface MilitaryPerson {
	public void add(MilitaryPerson person);
	public void remove(MilitaryPerson person);
	public MilitaryPerson getChild(int index);
	public Iterator<MilitaryPerson> getAllChildren();
	public boolean isSoldier();
	public double getSalary();
	public void setSalary(double salary);
	
}
