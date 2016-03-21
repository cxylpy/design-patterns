package com.lonphy.singletonpattern.example2;

public class Champion {
	private static Champion uniqueChampion;
	private String message;
	private Champion(String message) {
		this.uniqueChampion = this;
		this.message = message;
	}
	public static synchronized Champion getChampion(String message) {
		if(uniqueChampion==null) uniqueChampion = new Champion(message+"是冠军");
		return uniqueChampion;
	}
	
	public static void initChampion() {
		uniqueChampion = null;
	}
	public String getMsg() {
		return message;
	}
}
