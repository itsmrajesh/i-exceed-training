package com.training.oop.account;

public class SavingsAccount extends Account {
	static final double PERDAYLIMIT = 25000;

	public SavingsAccount(String accountHolder, long accountNumber, double balance, double minimum,
			double maintainceAmount, int duration, int intrest) {
		super(accountHolder, accountNumber, balance, minimum, maintainceAmount, duration, intrest);
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Amount : " + amount + " deposit successfull , Updated Balance is : " + balance);
	}

	public double withdraw(double amount) {
		if (balance >= amount && amount <= PERDAYLIMIT) {
			balance -= amount;
			System.out.print("Amount withdraw is :");
			return amount;
		}
		System.out.println("Insufficent funds in account");
		return 0;
	}

	public double getBalance() {
		System.out.print("Balance : ");
		return balance;
	}

}
