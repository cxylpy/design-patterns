package com.lonphy.abstractfactorypattern.test;

import org.junit.Test;

import com.lonphy.abstractfactorypattern.example2.Bank;
import com.lonphy.abstractfactorypattern.example2.BankOfCommunications;
import com.lonphy.abstractfactorypattern.example2.ChinaBank;
import com.lonphy.abstractfactorypattern.example2.ChinaConstructionBank;
import com.lonphy.abstractfactorypattern.example2.ShowDepositSlip;

public class Example2Test {
	public static void main(String[] args) {
		ShowDepositSlip slip = new ShowDepositSlip();
		Bank bank = new ChinaBank();
		slip.showDepositSlip(bank, "298765423", "张三", 5000);
		slip.setLocation(20, 20);
		slip = new ShowDepositSlip();//因为ShowDepositSlip继承了JPanel，所以需要创建新的对象
		bank = new ChinaConstructionBank();
		slip.showDepositSlip(bank, "128700542", "李四", 3000);
		slip.setLocation(240, 20);
		slip = new ShowDepositSlip();
		bank = new BankOfCommunications();
		slip.showDepositSlip(bank, "108765469", "孙五", 80);
		slip.setLocation(460,20);
		
	}
}
