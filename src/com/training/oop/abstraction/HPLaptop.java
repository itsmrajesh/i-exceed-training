package com.training.oop.abstraction;

public class HPLaptop extends Laptop {

	@Override
	public void swtichOn() {
		System.out.println("Switching ON laptop");
	}

	@Override
	public void swtichOff() {
		System.out.println("Switching OFF laptop");

	}

}
