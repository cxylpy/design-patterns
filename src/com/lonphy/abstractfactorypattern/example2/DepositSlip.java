package com.lonphy.abstractfactorypattern.example2;

public interface DepositSlip {
	public abstract String getBankName();
	public abstract String getClientName();
	public abstract String getClientNumber();
	public abstract int getAmountOfMoney();
}
