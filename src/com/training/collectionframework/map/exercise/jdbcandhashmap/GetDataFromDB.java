package com.training.collectionframework.map.exercise.jdbcandhashmap;

import java.sql.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class GetDataFromDB {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/dbdemo";
		Connection con = DriverManager.getConnection(url, "rajesh", "mysql123");
		String sql = "select * from employee";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		Employee emp;
		int empID;
		String empName;
		double sal;
		HashMap<Integer, Employee> map = new HashMap<>();
		System.out.println("Displaying data from DB");
		while (rs.next()) {
			empID = rs.getInt(1);
			empName = rs.getString(2);
			sal = rs.getDouble(3);
			emp = new Employee(empID, empName, sal);
			emp.showEmpInfo(); // invoking showEmployeeInfo() method in Employee Class
			map.put(empID, emp);
		}

		Set<Integer> keys = map.keySet();
		Iterator<Integer> it = keys.iterator();
		System.out.println("Displaying data from HashMap");
		while (it.hasNext()) {
			int key = it.next();
			emp = map.get(key);
			emp.showEmpInfo(); // invoking showEmployeeInfo() method in Employee Class
		}
	}

}
