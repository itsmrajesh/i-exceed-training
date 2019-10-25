package com.training.collectionframework.vector.exercises;

import java.util.Vector;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Rajesh", "Raichur", 75000.25);
		Employee emp2 = new Employee("Rakesh", "Bangalore", 55000.25);
		Employee emp3 = new Employee("Ramesh", "HYD", 62000.25);
		Employee emp4 = new Employee("Rahul", "AP", 41000.25);
		Employee emp5 = new Employee("Rakul", "TS", 43000.25);

		Vector<Employee> employeeVector = new Vector<Employee>();

		employeeVector.add(emp1);
		employeeVector.add(emp2);
		employeeVector.add(emp3);
		employeeVector.add(emp4);
		employeeVector.add(emp5);

		Employee emp = null;

		double max = 0.0, sal = 0.0, min = 0.0;
		int len = employeeVector.size();

		// find maximum salary from employee
		// finding highest salary
		for (int i = 0; i < len; i++) {
			sal = employeeVector.get(i).getSal();
			if (sal > max) {
				max = sal;
				emp = employeeVector.get(i);
			}
		}

		System.out.println("Highest Salary employee ");
		emp.showEmployeeInfo(); // Display employee info

		// find lowest salary
		emp = employeeVector.get(0);
		min = employeeVector.get(0).getSal();
		for (int i = 0; i < len; i++) {
			sal = employeeVector.get(i).getSal();
			if (min > sal) {
				min = sal;
				emp = employeeVector.get(i);
			}
		}
		System.out.println("Lowest Salary Emploee ");
		emp.showEmployeeInfo(); // Display employee info

		// finding total salary of employees
		double totalSal = findEmpTotalSalary(employeeVector);
		System.out.println("Total Salary of all employees : " + totalSal);

		String empName = "Rajesh";
		// finding employee details with employee name
		System.out.println("Finding employee details with emp name " + empName);
		emp = findEmployee(employeeVector, empName);
		if (emp != null) {
			emp.showEmployeeInfo();
		} else {
			System.out.println("No Employee found with given name " + empName);
		}

		// finding all employee average salary
		double avgSal = findAvgEmpSalary(employeeVector);
		System.out.println("Avg Sal of Employees : " + avgSal);

	}

	private static double findAvgEmpSalary(Vector<Employee> vector) {
		int len = vector.size();
		return (findEmpTotalSalary(vector) / len);
	}

	private static Employee findEmployee(Vector<Employee> vector, String empName) {
		for (int i = 0; i < vector.size(); i++) {
			if (empName.equals(vector.get(i).getEmpName())) {
				return vector.get(i);
			}
		}
		return null;
	}

	private static double findEmpTotalSalary(Vector<Employee> vector) {
		double totalSal = 0.0;
		for (int i = 0; i < vector.size(); i++) {
			totalSal += vector.get(i).getSal();
		}

		return totalSal;
	}

}
