package com.premit.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",
					                                      "c##premsai",
														  "prem123");
			return con;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
