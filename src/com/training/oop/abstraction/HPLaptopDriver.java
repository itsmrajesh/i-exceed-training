package com.training.oop.abstraction;

public class HPLaptopDriver {

	public static void main(String[] args) {
		Laptop laptop = new HPLaptop();
		laptop.swtichOff();
		laptop.swtichOn();
		//laptop.welcome();
		laptop = new DellLaptop();
		laptop.swtichOn();
		laptop.swtichOff();
	}

}
