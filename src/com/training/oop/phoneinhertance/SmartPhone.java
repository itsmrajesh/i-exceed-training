package com.training.oop.phoneinhertance;

public class SmartPhone extends MobilePhone {
	double camera, version;

	public SmartPhone(String brandName, double price, int memory, int batteryLife, double camera, double version) {
		super(brandName, price, memory, batteryLife);
		this.camera = camera;
		this.version = version;
	}

	@Override
	public void showFeatures() {
		super.showFeatures();
		System.out.println("Browse");
		System.out.println("Supports mulitmedia");
		System.out.println("Camera pixels : " + camera+" pixels");
		System.out.println("OS Version : " + version);
	}

}
