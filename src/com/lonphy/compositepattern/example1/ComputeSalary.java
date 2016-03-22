package com.lonphy.compositepattern.example1;

import java.util.Iterator;

public class ComputeSalary {
	public static double computeSalary(MilitaryPerson person) {
		double sum = 0;
		if(person.isSoldier())
			sum+=person.getSalary();
		else {
			sum+=person.getSalary();
			Iterator<MilitaryPerson> iter = person.getAllChildren();
			while(iter.hasNext()) sum += computeSalary(iter.next());
		}
		return sum;
	}
}
