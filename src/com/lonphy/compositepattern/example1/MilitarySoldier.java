package com.lonphy.compositepattern.example1;

import java.util.Iterator;

public class MilitarySoldier implements MilitaryPerson{
	private double salary;
	private String name;
	
	public MilitarySoldier(double salary, String name) {
		this.salary = salary;
		this.name = name;
	}

	@Override
	public void add(MilitaryPerson person) {
		
	}

	@Override
	public void remove(MilitaryPerson person) {
		
	}

	@Override
	public MilitaryPerson getChild(int index) {
		return null;
	}

	@Override
	public Iterator<MilitaryPerson> getAllChildren() {
		return null;
	}

	@Override
	public boolean isSoldier() {
		return true;
	}

	@Override
	public double getSalary() {
		return salary;
	}

	@Override
	public void setSalary(double salary) {
		this.salary =  salary;
		
	}

}
