package com.training.oop.exercise.customer;

public class Customer {
	private String cName;
	private int cId;
	private Car car;

	public Customer(String cName, int cId, Car car) {
		super();
		this.cName = cName;
		this.cId = cId;
		this.car = car;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public void showCustInfo() {
		System.out.println("Customer Details");
		System.out.println("------------------------");
		System.out.println("Customer Name : " + cName);
		System.out.println("Customer ID : " + cId);
		System.out.println("--------------------------");
		car.displayCarInfo();
	}
}
