package com.training.oop.account;

public class CurrentAccount extends Account {
	static final double PERDAYLIMIT = 100_000;

	public CurrentAccount(String accountHolder, long accountNumber, double balance, double minimum,
			double maintainceAmount, int duration, int intrest) {
		super(accountHolder, accountNumber, balance, minimum, maintainceAmount, duration, intrest);
	}

}
