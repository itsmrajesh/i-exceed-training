package com.training.jdbc.execise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductInfo {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdemo", "rajesh", "mysql123");
		String sql = "select * from products where category = 'Electronic'"; // retrieving with category = electronic
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		showInfo(rs);

		sql = "select sum(price) from products"; // finding sum
		rs = st.executeQuery(sql);
		rs.next();
		System.out.println("Sum of Prices " + rs.getDouble(1));

		sql = "select * from products where price = (select min(price) from products)"; // finding least price product
																						// details
		rs = st.executeQuery(sql);
		System.out.println("least price product details");
		showInfo(rs);

		sql = "select * from products where price = (select max(price) from products)";
		rs = st.executeQuery(sql);
		System.out.println("Highest price product details");
		showInfo(rs);
		sql = "select avg(price) from products";
		rs = st.executeQuery(sql);
		rs.next();
		System.out.println("Avg of products: " + rs.getDouble(1));

	}

	private static void showInfo(ResultSet rs) throws SQLException {
		while (rs.next()) {
			System.out.println("-----------------------");
			System.out.println("PID : " + rs.getInt(1));
			System.out.println("PName : " + rs.getString(2));
			System.out.println("Price : " + rs.getDouble(3));
			System.out.println("category : " + rs.getString(4));
		}
	}

}
