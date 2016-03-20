package com.lonphy.builderpattern.test;

import com.lonphy.builderpattern.example2.AmericanConcreteBuilder;
import com.lonphy.builderpattern.example2.Builder;
import com.lonphy.builderpattern.example2.ChineseConcreteBuilder;
import com.lonphy.builderpattern.example2.Director;

public class Example2Test {
	public static void main(String[] args) {
		Builder builder = new ChineseConcreteBuilder();
		Director director = new Director(builder,1945,3);
		director.constructProduct();builder = new AmericanConcreteBuilder();
		director = new Director(builder, 1945, 3);
		director.constructProduct();
	}
	
}
