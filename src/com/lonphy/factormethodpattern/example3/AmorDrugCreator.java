package com.lonphy.factormethodpattern.example3;

public class AmorDrugCreator implements DrugCreator{

	@Override
	public Drug getDrug() {
		int a[] = {200,5};
		Drug drug = new Amorolfine("甲硝唑胶囊", a);
		return drug;
	}

}
