package com.training.oop.exercise;

public class Employee {
	private String firstName;
	private String lastName;
	private char grade;
	private double sal;
	private String loc;

	public Employee() {
		this.firstName = "ABC";
		this.lastName = "XYZ";
		this.grade = 'A';
		this.sal = 55000;
		this.loc = "Bangalore";
	}

	public Employee(String firstName, String lastName, char grade, double sal, String loc) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.sal = sal;
		this.loc = loc;
	}

	public void displayInfo() {
		System.out.println("--------------------------");
		System.out.println("FirstName : " + firstName);
		System.out.println("lastname : " + lastName);
		System.out.println("Salary : " + sal);
		System.out.println("Grade : " + grade);
		System.out.println("Location : " + loc);
		System.out.println("--------------------------");
	}

	public double getSal() {
		return sal;
	}

	public void assignBonus() {
		double beforeSal = this.sal;
		switch (this.grade) {
		case 'A':
			this.sal += this.sal * .1;
			break;
		case 'B':
			this.sal += this.sal * .11;
			break;

		default:
			this.sal += this.sal * .2;
			break;
		}
		System.out.println("Bonus assigned to employee is : " + (this.sal - beforeSal));
	}
}
