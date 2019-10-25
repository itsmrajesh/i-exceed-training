package com.training.exercises;

public class Employee {
	String name,location;

	public Employee(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public void displayInfo() {
		System.out.println("Name : " + name);
		System.out.println("Location : " + location);
	}
}
