package com.lonphy.abstractfactorypattern.example2;

public abstract class Bank {
	public abstract DepositSlip createDepositSlip(String number, String name, int money);
	public abstract Seal createSeal();
}
