package com.training.oop.execise.employee;

public class Address {
	private int pincode;
	private String street;
	private String city;

	public Address(int pincode, String street, String city) {
		super();
		this.pincode = pincode;
		this.street = street;
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void ShowAddress() {
		System.out.println("Adresss Info");
		System.out.println("Street : " + street);
		System.out.println("City : " + city);
		System.out.println("Pincode : " + pincode);
	}

}
