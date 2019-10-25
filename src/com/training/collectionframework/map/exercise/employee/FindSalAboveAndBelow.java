package com.training.collectionframework.map.exercise.employee;

import java.util.Vector;

public class FindSalAboveAndBelow {
//Question: Display the employee details who are salary is below and above the given salary
	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Rajesh", "Raichur", 75000.25);
		Employee emp2 = new Employee(102, "Rakesh", "Bangalore", 55000.25);
		Employee emp3 = new Employee(103, "Ramesh", "HYD", 62000.25);
		Employee emp4 = new Employee(104, "Rahul", "AP", 400.25);
		Employee emp5 = new Employee(105, "Rakul", "TS", 143000.25);
		double sal = 6200.25;
		Vector<Employee> empVector = new Vector<>();
		empVector.add(emp1);
		empVector.add(emp2);
		empVector.add(emp3);
		empVector.add(emp4);
		empVector.add(emp5);
		Vector<Employee> employees = new Vector<>();
		for (int i = 0; i < empVector.size(); i++) {
			Employee emp = empVector.get(i);
			if (emp.getSal() < sal) {
				employees.add(emp);
			}
		}
		System.out.println("Employees whose salary below " + sal + " are as follows and No of Employees "
				+ employees.size());
		showEmp(employees);
		employees.clear();
		for (int i = 0; i < empVector.size(); i++) {
			Employee emp = empVector.get(i);
			if (emp.getSal() > sal) {
				employees.add(emp);
			}
		}

		System.out.println("Employees whose salary Above " + sal + " are as follows and No of Employees "
				+ employees.size());
		showEmp(employees);
	}

	private static void showEmp(Vector<Employee> empVector) {
		Employee emp = null;
		for (int i = 0; i < empVector.size(); i++) {
			emp = empVector.get(i);
			emp.showEmployeeInfo(); // invoking showEmployeeInfo() method in Employee Class

		}
	}

}
