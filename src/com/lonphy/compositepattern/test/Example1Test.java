package com.lonphy.compositepattern.test;

import org.junit.Test;

import com.lonphy.compositepattern.example1.ComputeSalary;
import com.lonphy.compositepattern.example1.MilitaryOfficer;
import com.lonphy.compositepattern.example1.MilitaryPerson;
import com.lonphy.compositepattern.example1.MilitarySoldier;

public class Example1Test {
	@Test
	public void testMain() {
		MilitaryPerson companyCommander = new MilitaryOfficer("连长", 5000);
		MilitaryPerson platoonLeader1 = new MilitaryOfficer("一排长", 4000);
		MilitaryPerson platoonLeader2 = new MilitaryOfficer("二排长", 4000);
		MilitaryPerson monitor11 = new MilitaryOfficer("一班长", 2000);
		MilitaryPerson monitor12 = new MilitaryOfficer("二班长", 2000);
		MilitaryPerson monitor13 = new MilitaryOfficer("三班长", 2000);
		MilitaryPerson monitor21 = new MilitaryOfficer("一班长", 2000);
		MilitaryPerson monitor22 = new MilitaryOfficer("二班长", 2000);
		MilitaryPerson monitor23 = new MilitaryOfficer("三班长", 2000);
//		MilitaryPerson monitor31 = new MilitaryOfficer("一班长", 2000);
//		MilitaryPerson monitor32 = new MilitaryOfficer("二班长", 2000);
//		MilitaryPerson monitor33 = new MilitaryOfficer("三班长", 2000);
		MilitaryPerson soldiers[] = new MilitaryPerson[60];
		for(int i = 0; i < soldiers.length; i++) {
			soldiers[i] = new MilitarySoldier(1000, "小兵");
		}
		companyCommander.add(platoonLeader1);
		companyCommander.add(platoonLeader2);
		platoonLeader1.add(monitor11);
		platoonLeader1.add(monitor12);
		platoonLeader1.add(monitor13);
		platoonLeader2.add(monitor21);
		platoonLeader2.add(monitor22);
		platoonLeader2.add(monitor23);
		for(int i = 0; i <= 9; i++) {
			monitor11.add(soldiers[i]);
			monitor12.add(soldiers[i+10]);
			monitor13.add(soldiers[i+20]);
			monitor21.add(soldiers[i+30]);
			monitor22.add(soldiers[i+40]);
			monitor23.add(soldiers[i+50]);
		}
		System.out.println("一排的军饷："+ComputeSalary.computeSalary(platoonLeader1));
		System.out.println("二排一班的军饷："+ComputeSalary.computeSalary(monitor21));
		System.out.println("全连的军饷："+ComputeSalary.computeSalary(companyCommander));
	}
}
