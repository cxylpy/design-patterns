package com.lonphy.factormethodpattern.test;

import org.junit.Test;

import com.lonphy.factormethodpattern.example3.AmorDrugCreator;
import com.lonphy.factormethodpattern.example3.Drug;
import com.lonphy.factormethodpattern.example3.DrugCreator;
import com.lonphy.factormethodpattern.example3.ParaDrugCreator;

public class Example3Test {
	@Test
	public void testMain() {
		DrugCreator creator = new ParaDrugCreator();
		Drug drug = creator.getDrug();
		System.out.println(drug.getName()+"的成分:");
		System.out.println(drug.getConstitution());
		creator = new AmorDrugCreator();
		drug = creator.getDrug();
		System.out.println(drug.getName()+"的成分:");
		System.out.println(drug.getConstitution());
		
	}
}
