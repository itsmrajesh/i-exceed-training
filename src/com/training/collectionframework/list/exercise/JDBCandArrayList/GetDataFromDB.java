package com.training.collectionframework.list.exercise.JDBCandArrayList;

import java.sql.*;
import java.util.ArrayList;

public class GetDataFromDB {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/dbdemo";
		Connection con = DriverManager.getConnection(url, "rajesh", "mysql123");
		String sql = "select * from employee";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		Employee emp = null;
		int empID;
		String empName;
		double sal;
		System.out.println("Displaying data from DB");
		ArrayList<Employee> list = new ArrayList<>();
		while (rs.next()) {
			empID = rs.getInt(1);
			empName = rs.getString(2);
			sal = rs.getDouble(3);
			emp = new Employee(empID, empName, sal);
			emp.showEmpInfo(); // invoking showEmployeeInfo() method in Employee Class
			list.add(emp); // adding employee objects into ArrayList
		}

		System.out.println("Displaying data from ArrayList");
		for (int i = 0; i < list.size(); i++) {
			emp = list.get(i);
			emp.showEmpInfo(); // invoking showEmployeeInfo() method in Employee Class
		}

	}

}
