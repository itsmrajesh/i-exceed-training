package com.training.collectionframework.map.exercise.employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class EmployeeDriver {

	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "Rajesh", "Raichur", 75000.25);
		Employee emp2 = new Employee(102, "Rakesh", "Bangalore", 55000.25);
		Employee emp3 = new Employee(103, "Ramesh", "HYD", 62000.25);
		Employee emp4 = new Employee(104, "Rahul", "AP", 41000.25);
		Employee emp5 = new Employee(105, "Rakul", "TS", 143000.25);
		HashMap<Integer, Employee> map = new HashMap<>();
		map.put(101, emp1);
		map.put(102, emp2);
		map.put(103, emp3);
		map.put(104, emp4);
		map.put(105, emp5);
		Set<Integer> keys = map.keySet();
		Iterator<Integer> it = keys.iterator();
		double sal, bonus = 0, netSal, tax = 0;
		while (it.hasNext()) {
			int key = it.next();
			Employee emp = map.get(key);
			sal = emp.getSal();
			if (sal <= 50000) {
				bonus = sal * 0.2;
			} else if (sal > 50000 && sal <= 100000) {
				bonus = sal * 0.1;
				tax = sal * 0.1;
			} else {
				tax = sal * 0.2;
			}
			emp.setBonus(bonus);
			emp.setTax(tax);
			netSal = sal + bonus - tax;
			emp.setNetSal(netSal);
			emp.showEmployeeInfo();
		}
	}

}
