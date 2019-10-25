package com.training.oop.exercise.product;

public class ForumProduct {
	private String productName;
	private double price;

	public void showInfo() {
		System.out.println("Product Name : " + productName);
		System.out.println("Product price : " + price);
	}

	public ForumProduct(String productName, double price) {
		super();
		this.productName = productName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
