package com.training.collectionframework.vector.exercises;

public class Employee {
	private String empName;
	private String location;
	private double sal;

	public Employee(String empName, String location, double sal) {
		super();
		this.empName = empName;
		this.location = location;
		this.sal = sal;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public void showEmployeeInfo() {
		System.out.println("-----------------------");
		System.out.println("Name : " + empName);
		System.out.println("Location : " + location);
		System.out.println("Salary : " + sal);
		System.out.println("-----------------------");
	}

}
