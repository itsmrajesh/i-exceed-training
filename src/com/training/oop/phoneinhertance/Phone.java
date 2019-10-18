package com.training.oop.phoneinhertance;

public class Phone {
	String brandName;
	double price;

	public Phone(String brandName, double price) {
		super();
		this.brandName = brandName;
		this.price = price;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void showFeatures() {
		System.out.println("Features");
		System.out.println("Make and receive calls ");
	}
}
