package com.training.oop.phoneinhertance;

public class PhoneDriver {

	public static void main(String[] args) {
		Phone phone = new Phone("Moto", 1000);
		System.out.println("Phone Features");
		phone.showFeatures();
		System.out.println("---------------------");
		MobilePhone mp = new MobilePhone("Moto", 2500, 4, 6);
		System.out.println("Mobile Phone Features");
		mp.showFeatures();
		System.out.println("---------------------");
		SmartPhone sp = new SmartPhone("Moto G5 S Plus", 15000, 8, 10, 12.5, 9.1);
		System.out.println("Smart Phone Features");
		sp.showFeatures();
		System.out.println("---------------------");
	}

}
