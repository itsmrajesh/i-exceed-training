package com.training.jdbc;

import java.sql.*;

public class FindhighestPrice {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdemo", "rajesh", "mysql123");
		String sql = "select * from books where price = (select max(price) from books )";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			System.out.println("ID :" + rs.getInt(1));
			System.out.println("BookName : " + rs.getString(2));
			System.out.println("Author : " + rs.getString(4));
			System.out.println("Price : " + rs.getDouble(3));
		}
	}

}
