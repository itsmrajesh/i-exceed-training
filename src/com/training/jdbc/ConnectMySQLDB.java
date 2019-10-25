package com.training.jdbc;

import java.sql.*;

public class ConnectMySQLDB {
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private static ResultSet rs;

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbdemo", "rajesh", "mysql123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) throws SQLException {
		ConnectMySQLDB db = new ConnectMySQLDB();
		Connection con = db.getConnection();
		String author = "guru";// args[0];
		String sql = "select sum(price) from books where author = ?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, author);
		rs = pst.executeQuery();
		int sum = 0;
		rs.next();
		sum = rs.getInt(1);
		System.out.println("Total sum of books : " + sum);
	}

}
