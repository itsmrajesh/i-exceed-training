package com.training.oop.account;

public class AccountDriver {

	public static void main(String[] args) {
		SavingsAccount sa1 = new SavingsAccount("Rajesh", 9910234, 5000, 500, 250, 90, 2);
		System.out.println(sa1.getBalance());
		sa1.deposit(1000);
		System.out.println(sa1.getBalance());
		sa1.deposit(500);
		System.out.println(sa1.withdraw(1000));
		System.out.println(sa1.getBalance());
	}

}
