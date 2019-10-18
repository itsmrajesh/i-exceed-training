package com.training.oop.execise.product;

public class ProductDriver {

	public static void main(String[] args) {
		ForumProduct product1 = new ForumProduct("Apple", 10000.00);
		ForumProduct product2 = new ForumProduct("Samsung", 5000.00);
		ForumProduct product3 = new ForumProduct("Lenovo", 6000.00);
		ForumProduct product4 = new ForumProduct("RedMI", 11000.00);
		ForumProduct product5 = new ForumProduct("Moto", 5500.00);

		Customer customer1 = new Customer("Rajesh", "Raichur", product5);
		Customer customer2 = new Customer("Sujith", "AP", product3);
		Customer customer3 = new Customer("Samarth", "CHK", product2);
		Customer customer4 = new Customer("Gokul", "Hassan", product4);
		Customer customer5 = new Customer("Mrudulla", "Bangalore", product1);

		Customer custArr[] = { customer1, customer2, customer3, customer4, customer5 };
		Customer maxPusCustomer = custArr[0];
		double max = 0, price;
		for (int i = 0; i < custArr.length; i++) {
			price = custArr[i].getProduct().getPrice();
			if (price > max) {
				max = price;
				maxPusCustomer = custArr[i];
			}
		}
		System.out.println("Coustomer who made highest purchase : ");
		maxPusCustomer.showInfo();

	}

}
