package com.training.oop.account;

public class Account {
	String accountHolder;
	long accountNumber;
	double balance, minimumBalance, maintainceAmount;
	int duration, intrest;

	
	public Account(String accountHolder, long accountNumber, double balance, double minimum, double maintainceAmount,
			int duration, int intrest) {
		super();
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.minimumBalance = minimum;
		this.maintainceAmount = maintainceAmount;
		this.duration = duration;
		this.intrest = intrest;
	}


	public String getAccountHolder() {
		return accountHolder;
	}


	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}


	public long getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getMinimumBalance() {
		return minimumBalance;
	}


	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}


	public double getMaintainceAmount() {
		return maintainceAmount;
	}


	public void setMaintainceAmount(double maintainceAmount) {
		this.maintainceAmount = maintainceAmount;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public int getIntrest() {
		return intrest;
	}


	public void setIntrest(int intrest) {
		this.intrest = intrest;
	}
	
	

}
