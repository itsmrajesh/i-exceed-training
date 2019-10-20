package com.training.execise;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee emp = new Employee("Rajesh", "Raichur");
		System.out.println("Before method showInfo ");
		showInfo(emp); // calling by reference 
		System.out.println("After method showInfo ");
		emp.displayInfo();

	}

	private static void showInfo(Employee emp) {
		emp.displayInfo();
		emp.location = "Bangalore";
	}

}
