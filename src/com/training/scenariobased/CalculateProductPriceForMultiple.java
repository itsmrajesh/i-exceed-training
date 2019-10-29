package com.training.scenariobased;

import java.util.Scanner;

public class CalculateProductPriceForMultiple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String status = "";
		int quantity;
		double price;
		double amount;
		System.out.println("Welcome to Super market ");
		while (!status.equals("n")) {
			System.out.println("Enter product price : ");
			price = sc.nextDouble();
			System.out.println("Enter the quantity, how many you want to buy :");
			quantity = sc.nextInt();
			amount = quantity * price;
			System.out.println("Amount to be paid : " + amount);
			System.out.println("Do you like to continue(y) esle (n)");
			status = sc.next();
		}
		System.out.println("Thank you for shopping");
	}

}
