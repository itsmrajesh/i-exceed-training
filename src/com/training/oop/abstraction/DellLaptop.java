package com.training.oop.abstraction;

public class DellLaptop extends Laptop{

	@Override
	void swtichOn() {
		System.out.println("Swtiching ON DELL LAPTOP using KEY");
	}

	@Override
	void swtichOff() {
		System.out.println("DELL LAPTOP Auto Swtich off");
	}

}
