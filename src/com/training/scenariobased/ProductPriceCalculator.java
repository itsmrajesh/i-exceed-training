package com.training.scenariobased;

import java.util.Scanner;

public class ProductPriceCalculator {

	public static void main(String[] args) {
		// 3rd Question from document
		int quantity = 10;
		double price = 50.5;
		double amount = quantity * price;
		System.out.println("Amount to be paid : " + amount);

		// 4th Question from document
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product price : ");
		price = sc.nextDouble();
		System.out.println("Enter the quantity, how many you want to buy :");
		quantity = sc.nextInt();
		amount = quantity * price;
		System.out.println("Amount to be paid : " + amount);

		// 5th Question from document
		double discountRate;
		System.out.println("Enter product price : ");
		price = sc.nextDouble();
		System.out.println("Enter the quantity, how many you want to buy :");
		quantity = sc.nextInt();
		System.out.println("Enter the discount for product");
		discountRate = sc.nextDouble();
		price = price - (price * discountRate);
		amount = quantity * price;
		System.out.println("Amount to be paid : " + amount);

	}

}
