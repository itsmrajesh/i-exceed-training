package com.training.oop.phoneinhertance;

public class MobilePhone extends Phone {
	int memory;
	int batteryLife;

	public MobilePhone(String brandName, double price, int memory, int batteryLife) {
		super(brandName, price);
		this.memory = memory;
		this.batteryLife = batteryLife;
	}

	@Override
	public void showFeatures() {
		super.showFeatures();
		System.out.println("Contact Book");
		System.out.println("Memory is " + memory);
		System.out.println("Battery life " + batteryLife+" hours");
	}

}
