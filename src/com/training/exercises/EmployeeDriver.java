package com.training.exercises;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee emp = new Employee("Rajesh", "Raichur");
		System.out.println("Before method showInfo ");
		showInfo(emp); // calling by reference
		System.out.println("After method showInfo ");
		emp.displayInfo();
		int i = 20;
		System.out.println(i); // calling by value
		show(10);
		System.out.println(i);
		Integer ij = new Integer(100);
		System.out.println(ij);
		show(ij);
		System.out.println(ij);
		StringBuffer sb;

	}

	private static void show(int i) {
		i = 10;
	}

	private static void showInfo(Employee emp) {
		emp.displayInfo();
		emp.location = "Bangalore"; // updating the memory
	}

}
