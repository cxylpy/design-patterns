package com.lonphy.factormethodpattern.example3;

public class ParaDrugCreator implements DrugCreator{
	
	@Override
	public Drug getDrug() {
		int a[] = {250,15,1,10};
		Drug drug = new Paracetamol("氨加黄敏胶囊", a);
		return drug;
	}

}
