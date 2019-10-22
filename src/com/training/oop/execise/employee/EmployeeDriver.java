package com.training.oop.execise.employee;

public class EmployeeDriver {

	public static void main(String[] args) {
		Project project1 = new Project(101, "SMS", "Wipro", "Bangalore", 250000);
		Project project2 = new Project(102, "Tracker", "IBM", "Bangalore", 550000);
		Project project3 = new Project(103, "AI-ML", "Infosys", "Bangalore", 1350000);
		Project project4 = new Project(104, "Freebie", "TCS", "Bangalore", 220000);
		Project project5 = new Project(105, "Booking System", "Wipro", "Bangalore", 150000);

		Address address1 = new Address(562101, "MG road", "Bangalore");
		Address address2 = new Address(562102, "BG road", "Bangalore");
		Address address3 = new Address(562103, "AG road", "Bangalore");
		Address address4 = new Address(562104, "SG road", "Bangalore");
		Address address5 = new Address(562105, "DG road", "Bangalore");

		Employee emp1 = new Employee(201, "Rajesh", address1, project3);
		Employee emp2 = new Employee(202, "Sujith", address2, project1);
		Employee emp3 = new Employee(203, "Mrudulla", address3, project2);
		Employee emp4 = new Employee(201, "Achal", address4, project4);
		Employee emp5 = new Employee(201, "Manju", address5, project5);

		Employee[] empArr = { emp1, emp2, emp3, emp4, emp5 };

		double maxBudget = 0, budget;
		Employee emp = empArr[0];
		// finding highest budget
		for (int i = 0; i < empArr.length; i++) {
			budget = empArr[i].getProject().getBudget();  // getting budget from employee object
			if (budget > maxBudget) {
				maxBudget = budget;
				emp = empArr[i];
			}
		}

		emp.showEmpInfo(); // showing the details of employee who is working for highest budget

	}

}
