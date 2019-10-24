package com.training.exceptionhandling.userdefined;

public class InsufficientBalanceException extends Exception {
	static double bal = 5000;

	public static void withDraw(double amount) throws InsufficientBalanceException {
		if (amount < bal) {
			bal -= amount;
			System.out.println("Withdraw succcessfull updated balance is " + bal);
		} else {
			InsufficientBalanceException insufficientBalanceException = new InsufficientBalanceException();
			throw insufficientBalanceException;
		}
	}

	@Override
	public String getMessage() {
		return "Insufficent funds in your account";
	}
}
