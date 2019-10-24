package com.training.jdbc;

import java.sql.*;

public class ConnectSQLiteDB {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:sqlite:C:/sqlite/demo.db"; // DB Location
		Connection con = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url); // connection to DB
			System.out.println("Connection success");
		} catch (SQLException e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
		String sql = "select * from students";
		try {
			Statement st = con.createStatement();
			rs = st.executeQuery(sql);
			showInfo(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sql = "select * from students where name = ?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, "rajesh");
		rs=pst.executeQuery();
		showInfo(rs);

	}

	private static void showInfo(ResultSet rs) throws SQLException {
		while (rs.next()) {
			System.out.println("---------------------");
			System.out.println("ID : " + rs.getInt(1));
			System.out.println("Name : " + rs.getString(2));
		}
	}

}
