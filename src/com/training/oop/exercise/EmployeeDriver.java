package com.training.oop.exercise;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee emp1 = new Employee("Rajesh", "M", 'S', 90000, "Bangalore");
		Employee emp2 = new Employee("Ganesh", "Gowda", 'B', 45000, "Chennai");
		
		if (emp1.getSal() > emp2.getSal())
			emp1.displayInfo();
		else
			emp2.displayInfo();
		
		emp1.assignBonus();
		emp1.displayInfo();
	}

}
