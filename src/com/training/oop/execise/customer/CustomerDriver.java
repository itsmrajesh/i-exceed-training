package com.training.oop.execise.customer;

public class CustomerDriver {

	public static void main(String[] args) {
		Car car1 = new Car("BMW", 50000);
		Car car2 = new Car("AUDI", 55000);
		Car car3 = new Car("BENZ", 750000);

		Customer customer1 = new Customer("Rajesh", 101, car3);
		Customer customer2 = new Customer("Mrudulla", 102, car2);
		Customer customer3 = new Customer("Achal", 104, car1);
		Customer customer4 = new Customer("Manju", 103, car1);
		Customer customer5 = new Customer("Sujith", 105, car3);

		Customer[] customerArr = { customer1, customer2, customer3, customer4, customer5 };
		Customer cust = null;
		double max = 0, price = 0;
		{
			for (Customer customer : customerArr) {
				price = customer.getCar().getPrice();
				if (price > max) {
					max = price;
					cust = customer;
				}
			}
		}
		cust.showCustInfo();
	}

}