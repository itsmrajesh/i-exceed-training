package com.training.collectionframework.map.exercise.employee;

import java.util.Vector;

public class EmployeeDriver2 {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "Rajesh", "Raichur", 75000.25);
		Employee emp2 = new Employee(102, "Rakesh", "Bangalore", 55000.25);
		Employee emp3 = new Employee(103, "Ramesh", "HYD", 62000.25);
		Employee emp4 = new Employee(104, "Rahul", "AP", 400.25);
		Employee emp5 = new Employee(105, "Rakul", "TS", 143000.25);
		double sal = 6200.25;
		Vector<Employee> v = new Vector<>();
		v.add(emp1);
		v.add(emp2);
		v.add(emp3);
		v.add(emp4);
		v.add(emp5);
		Vector<Employee> employees = new Vector<>();
		for (int i = 0; i < v.size(); i++) {
			Employee emp = v.get(i);
			if (emp.getSal() < sal) {
				employees.add(emp);
			}
		}
		System.out.println("below " + sal + " No of Employee " + employees.size());
		showEmp(employees);
		employees.clear();
		for (int i = 0; i < v.size(); i++) {
			Employee emp = v.get(i);
			if (emp.getSal() > sal) {
				employees.add(emp);
			}
		}
		System.out.println("Above " + sal + " No of Employee " + employees.size());

		showEmp(employees);
	}

	private static void showEmp(Vector<Employee> v) {
		for (int i = 0; i < v.size(); i++)
			v.get(i).showEmployeeInfo();
	}

}
