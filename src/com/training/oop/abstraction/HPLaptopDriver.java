package com.training.oop.abstraction;

public class HPLaptopDriver {

	public static void main(String[] args) {
		Laptop hpLap = new HPLaptop();
		hpLap.swtichOff();
		hpLap.swtichOn();
		//hpLap.welcome();
		hpLap = new DellLaptop();
		hpLap.swtichOn();
		hpLap.swtichOff();
	}

}
