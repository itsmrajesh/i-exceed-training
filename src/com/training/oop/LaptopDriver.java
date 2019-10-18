package com.training.oop;

public class LaptopDriver {

	public static void main(String[] args) {
		Laptop laptop1 = new Laptop();
		laptop1.start();
		Laptop laptop2 = new Laptop("DELL", "BLACK", "AMD", 50000, 3.00);
		laptop2.start(); 
		
		
	}

}
