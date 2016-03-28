package com.lonphy.visitorpattern.test;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Test;

import com.lonphy.visitorpattern.example1.Company;
import com.lonphy.visitorpattern.example1.GraduateStudent;
import com.lonphy.visitorpattern.example1.Student;
import com.lonphy.visitorpattern.example1.Undergraduate;
import com.lonphy.visitorpattern.example1.Visitor;

public class Example1Test {
	@Test
	public void testMain() {
		Visitor visitor = new Company();
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Undergraduate(67, 88, "张三"));
		studentList.add(new Undergraduate(90, 98, "李四"));
		studentList.add(new Undergraduate(85,92,"王五"));
		studentList.add(new GraduateStudent(88, 70, 87, "小明"));
		studentList.add(new GraduateStudent(90, 95, 82, "小王"));
		Iterator<Student> iterator = studentList.iterator();
		while(iterator.hasNext()) {
			iterator.next().accept(visitor);
		}
	}
}
