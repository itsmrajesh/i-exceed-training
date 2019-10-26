package com.training.stdinputoutput.product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectDB {

	Connection con;

	public ConnectDB() {
		getConnection();
	}

	public Connection getConnection() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdemo", "rajesh", "mysql123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public void insert(Product product) throws SQLException {
		String sql = "insert into products2 values (?,?,?)";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, product.getProductName());
		pst.setDouble(2, product.getPrice());
		pst.setString(3, product.getCategory());
		int c = pst.executeUpdate();
		if (c == 1)
			System.out.println("Data Inserted for product info " + product);
		else
			System.out.println("Something went wrong");
	}
}
