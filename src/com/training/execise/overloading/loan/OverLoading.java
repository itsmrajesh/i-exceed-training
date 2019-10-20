package com.training.execise.overloading.loan;

public class OverLoading {

	public static void main(String[] args) {
		double res = calculateInterest(new EducationLoan(10000));
		System.out.println("Education Loan Interest : " + res);
		System.out.println("Home Loan Interest : " + calculateInterest(new HomeLoan(500000)));

	}

	private static double calculateInterest(HomeLoan homeLoan) {
		return homeLoan.Loanamount * (HomeLoan.interest);
	}

	private static double calculateInterest(EducationLoan educationLoan) {
		return educationLoan.amount * (EducationLoan.interest);
	}

}
