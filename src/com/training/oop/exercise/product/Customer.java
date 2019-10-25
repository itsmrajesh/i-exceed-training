package com.training.oop.exercise.product;

public class Customer {
	private String name;
	private String loc;
	private double purchsed;
	private ForumProduct product;

	public Customer(String name, String loc, ForumProduct product) {
		this.name = name;
		this.loc = loc;
		this.product = product;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public double getPurchsed() {
		return purchsed;
	}

	public void setPurchsed(double purchsed) {
		this.purchsed = purchsed;
	}

	public ForumProduct getProduct() {
		return product;
	}

	public void setProduct(ForumProduct product) {
		this.product = product;
	}

	public void showInfo() {
		System.out.println("Customer Name : " + name);
		System.out.println("Customer Location : " + loc);
		product.showInfo();
	}
}
