package com.lonphy.builderpattern.example2;

import java.util.Calendar;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class CalendarProduct {
	private Calendar calendar;
	private String title;
	private String[] weekTitle;
	private String[][] dayOfMonth;
	private int year = 2008, month = 1;
	public void showCalendarPad() {
		JTable table;
		table = new JTable(dayOfMonth,weekTitle);
		JDialog dialog = new JDialog();
		dialog.setTitle(title);
		dialog.add(new JScrollPane(table));
		dialog.setBounds(130, 160, 220, 180);
		dialog.setVisible(true);
		dialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}
	public Calendar getCalendar() {
		return calendar;
	}
	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String[] getWeekTitle() {
		return weekTitle;
	}
	public void setWeekTitle(String[] weekTitle) {
		this.weekTitle = weekTitle;
	}
	public String[][] getDayOfMonth() {
		return dayOfMonth;
	}
	public void setDayOfMonth(String[][] dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	
}
