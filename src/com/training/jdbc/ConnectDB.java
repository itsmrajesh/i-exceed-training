package com.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {

	public static void main(String[] args) {
		String url = "jdbc:sqlite:C:/sqlite/ncet.db"; // DB Location
		try {
			Connection con = DriverManager.getConnection(url);
			System.out.println("Connection success");
		} catch (SQLException e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
		
	}

}
