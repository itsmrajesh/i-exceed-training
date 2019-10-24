package com.training.exceptionhandling.userdefined;

public class TestuserDefinedException {

	public static void main(String[] args) {
		try {
			InsufficientBalanceException.withDraw(11000);
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}
	}

}
