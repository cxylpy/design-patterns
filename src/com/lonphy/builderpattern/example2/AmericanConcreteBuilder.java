package com.lonphy.builderpattern.example2;

import java.util.Calendar;

public class AmericanConcreteBuilder implements Builder{
	private CalendarProduct product;
	public AmericanConcreteBuilder() {
		product = new CalendarProduct();
	}
	@Override
	public void buildTitle() {
		String s[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		product.setTitle("The calendar of "+s[product.getMonth()-1]+" of "+ product.getYear());
	}

	@Override
	public boolean buildWeekTitle() {
		String[] s={"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
		product.setWeekTitle(s);
		return true;
	}

	@Override
	public boolean buildCalendar(int year, int month) {
		product.setYear(year);
		product.setMonth(month);
		if(month>=1&&month<=12) {
			product.setCalendar(Calendar.getInstance());
			product.getCalendar().set(year, month-1,1);
			return true;
		}
		return false;
	}

	@Override
	public void buildDayOfMonth() {
		int weekDay = product.getCalendar().get(Calendar.DAY_OF_WEEK) - 1;
		int day = 0;
		int month = product.getMonth();
		int year = product.getYear();
		if(month ==1||month==3||month==5||month==7||month==8||month==10||month==12)day = 31;
		if(month==4||month==6||month==9||month==11) day = 30;
		if(month==2) {
			if(((year%4==0)&&(year%100!=0))||(year%400==0)) {
				day = 29;
			} else {
				day = 28;
			}
		}
		int nextDay = 1;
		String[][] a = new String[6][7];
		for(int i = 0; i < 6; i++) 
			for(int j = 0; j < 7; j++) {
				a[i][j] = "";
			}
		for(int k = 0; k < 6; k++) { 
			if(k==0)
				for(int j = weekDay; j<7; j++) {
					a[k][j] = ""+nextDay;
					nextDay++;
				}
			else 
				for(int j = 0; j < 7&&nextDay<=day; j++) {
					a[k][j] = ""+nextDay;
					nextDay++;
				}
		}
		product.setDayOfMonth(a);
	}

	@Override
	public CalendarProduct genCalendarProduct() {
		return product;
	}

}
