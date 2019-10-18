package com.training.oop;

public class Laptop {

	private String brand;
	private String color;
	private String processor;
	private double price;
	private double weight;

	public Laptop() {
		this.brand = "HP";
		this.color = "Silver";
		this.processor = "INTEL";
		this.price = 65000;
		this.weight = 2.5;
	}

	public Laptop(String brand, String color, String processor, double price, double weight) {
		this.brand = brand;
		this.color = color;
		this.processor = processor;
		this.price = price;
		this.weight = weight;
	}

	public void start() {
		System.out.println(this.brand + " starts");
	}

	public void stop() {
		System.out.println(this.brand + " Stops");
	}

	public void run() {
		System.out.println(this.brand + " is Running");
	}
}
