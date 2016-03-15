package com.lonphy.iteratorpattern.example3;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class UseSet {
	LinkedList<Student> list;
	Hashtable<String,Student> table;
	TreeSet<Student> tree;
	public UseSet() {
		super();
		list = new LinkedList<>();
		table = new Hashtable<>();
		tree = new TreeSet<>();
	}
	
	public void addStudent(Student stu) {
		list.add(stu);
		update();
	}
	
	private void update() {
		tree.clear();
		Iterator<Student> iterator = list.iterator();
		while(iterator.hasNext()) {
			 Student stu = iterator.next();
			 String number = stu.getNumber();
			 table.put(number, stu);
			 tree.add(stu);
			
		}
	}
	public void lookStudent(String num) {
		Student stu = table.get(num);
		String number = stu.getNumber();
		String name = stu.getName();
		double score = stu.getScore();
		System.out.println("学号："+number+"，姓名："+"，分数："+score);
	}
	public void printStudentsByScore() {
		Iterator<Student> iterator = tree.iterator();
		while(iterator.hasNext()) {
			Student stu = iterator.next();
			String number = stu.getNumber();
			String name = stu.getName();
			double score = stu.getScore();
			System.out.println("学号："+number+"，姓名："+"，分数："+score);
		}
	}
}
