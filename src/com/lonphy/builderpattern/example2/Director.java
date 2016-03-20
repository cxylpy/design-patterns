package com.lonphy.builderpattern.example2;

public class Director {
	private Builder builder;
	private int year,month;
	public Director(Builder builder, int year, int month) {
		this.builder = builder;
		this.year = year;
		this.month = month;
	}
	public void constructProduct() {
		boolean ok = false;
		ok = builder.buildWeekTitle();
		if(ok) ok = builder.buildCalendar(year, month);
		if(ok) {
			builder.buildDayOfMonth();
			builder.buildTitle();
			builder.genCalendarProduct().showCalendarPad();
		}
	}
}
