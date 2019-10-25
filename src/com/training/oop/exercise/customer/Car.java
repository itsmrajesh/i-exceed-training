package com.training.oop.exercise.customer;

public class Car {
	private String carName;
	private double price;

	public Car(String carName, double price) {
		super();
		this.carName = carName;
		this.price = price;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void displayCarInfo() {
		System.out.println("Car Details ");
		System.out.println("---------------------");
		System.out.println("Car Name : " + carName);
		System.out.println("Car Price :" + price);
	}
}
