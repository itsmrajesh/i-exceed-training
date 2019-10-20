package com.training.jdbc;

import java.sql.*;

public class ConnectMySQLDB {
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebill", "rajesh", "mysql123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) {
		String url = "";
	}

}
