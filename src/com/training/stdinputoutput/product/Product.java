package com.training.stdinputoutput.product;

public class Product {
	private String productName;
	private double price;
	private String category;

	public Product(String name, double price, String category) {
		super();
		this.productName = name;
		this.price = price;
		this.category = category;
	}

	public String getProductName() {
		return productName;
	}

	public void setName(String name) {
		this.productName = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return productName + " in Category " + category;
	}

	public void showProductInfo() {
		System.out.println("-------------------------");
		System.out.println("Product name : " + productName);
		System.out.println("Product price : " + price);
		System.out.println("Product Category : " + category);
		System.out.println("-------------------------");
	}
}
