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
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/iexceed", "rajesh", "mysql123");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public static void main(String[] args) throws SQLException {
		ConnectMySQLDB db = new ConnectMySQLDB();
		Connection con = db.getConnection();
		Statement st = con.createStatement();
		String sql = "select * from emp";
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) {
			System.out.println("-------------------------");
			System.out.println("Emp ID : " + rs.getInt(1));
			System.out.println("Emp Name : " + rs.getString(2));
			System.out.println("Dept : " + rs.getString(3));
			System.out.println("Adress : " + rs.getString(4));

		}
	}

}
