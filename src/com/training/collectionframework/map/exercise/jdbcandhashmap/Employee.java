package com.training.collectionframework.map.exercise.jdbcandhashmap;

public class Employee {
	private int empID;
	private String empName;
	private double sal;

	public Employee(int empID, String empName, double sal) {
		this.empID = empID;
		this.empName = empName;
		this.sal = sal;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public void showEmpInfo() {
		System.out.println("---------------------------");
		System.out.println("ID : " + empID);
		System.out.println("Name : " + empName);
		System.out.println("Salary : " + sal);
		System.out.println("--------------------------- ");
	}
}
