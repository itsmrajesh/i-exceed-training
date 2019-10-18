package com.training.oop.execise;

public class ProductDriver {

	public static void main(String[] args) {
		Product p1 = new Product("HP", 45000);
		Product p2 = new Product("DELL", 35000);
		System.out.println("Sum of Products is : " + (p1.getPrice() + p2.getPrice()));
	}

}
