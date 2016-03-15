package com.lonphy.iteratorpattern.example3;

public class Student implements Comparable<Student>{
	private String number,name;
	private double score=0;
	private int x = 10;
	
	public Student(String number, String name, double score) {
		this.number = number;
		this.name = name;
		this.score = score;
	}

	@Override
	public int compareTo(Student s) {
		if(Math.abs(this.getScore()-s.getScore())<=1./10000)return 1;
		return (int)(1000*(this.getScore()-s.getScore()));
	}

	public String getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public double getScore() {
		return score;
	}

	public int getX() {
		return x;
	}

	

}
