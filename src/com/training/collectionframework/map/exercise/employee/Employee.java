package com.training.collectionframework.map.exercise.employee;

public class Employee {
	private int empID;
	private String empName;
	private String location;
	private double basicSal;
	private double tax;
	private double bonus;
	private double netSal;

	public Employee(int empID, String empName, String location, double sal) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.location = location;
		this.basicSal = sal;
		init(sal); // calculate tax , bonus and net salary
	}

	private void init(double sal) {
		if (sal <= 50_000) {
			this.bonus = sal * 0.2;  // bonus = 20%
		} else if (sal > 50_000 && sal <= 100_000) {
			this.bonus = sal * 0.1; // bonus = 10%
			this.tax = sal * 0.1;  // tax = 10%
		} else {
			this.tax = sal * 0.2;  // tax = 20%
		}
		this.netSal = this.basicSal + this.bonus - this.tax; // calculating net salary
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
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
		return basicSal;
	}

	public void setSal(double sal) {
		this.basicSal = sal;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getNetSal() {
		return netSal;
	}

	public void setNetSal(double netSal) {
		this.netSal = netSal;
	}

	public void showEmployeeInfo() {
		System.out.println("-----------------------");
		System.out.println("ID : " + empID);
		System.out.println("Name : " + empName);
		System.out.println("Location : " + location);
		System.out.println("Basic Salary : " + basicSal);
		System.out.println("Tax : " + tax);
		System.out.println("Bonus : " + bonus);
		System.out.println("Net Sal : " + netSal);
		System.out.println("-----------------------");
	}

}
