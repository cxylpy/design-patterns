package com.lonphy.compositepattern.example1;

import java.util.Iterator;
import java.util.LinkedList;

public class MilitaryOfficer implements MilitaryPerson{
	private LinkedList<MilitaryPerson> list;
	private String name;
	private double salary;
	public MilitaryOfficer(String name, double salary) {
		this.name = name;
		this.salary = salary;
		this.list = new LinkedList<>();
	}
	@Override
	public void add(MilitaryPerson person) {
		list.add(person);
	}
	@Override
	public void remove(MilitaryPerson person) {
		list.remove(person);
	}
	@Override
	public MilitaryPerson getChild(int index) {
		return list.get(index);
	}
	@Override
	public Iterator<MilitaryPerson> getAllChildren() {
		return list.iterator();
	}
	@Override
	public boolean isSoldier() {
		return false;
	}
	@Override
	public double getSalary() {
		return salary;
	}
	@Override
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
