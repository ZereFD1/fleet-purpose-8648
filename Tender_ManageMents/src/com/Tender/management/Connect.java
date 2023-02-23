package com.Tender.management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {

	private final static String url = "jdbc:mysql://localhost/harshsql";
	private final static String username = "root";
	private final static String password = "root";

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception

			e.printStackTrace();
		}
	}

	public static Connection connectToDatabase() throws SQLException {

		return DriverManager.getConnection(url, username, password);
	}

	public static void closeConnection(Connection connection) throws SQLException {

		if (connection != null) {
			connection.close();
		}
	}

	public static void main(String[] args) throws SQLException {

		Connection conn = Connect.connectToDatabase();
		System.out.println("Connected");
		Connect.closeConnection(conn);
		System.out.println("Closed");

	}

}

