package com.premit.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.premit.demo.DbConnection;

public class TestDbConnection {
	
	public DbConnection dbConnection = null;
	public Connection con = null;
	
	@BeforeEach
	public void setUp() {
		dbConnection = new DbConnection();
	}
	
	@Test
	public void testGetConnection() {
		con = dbConnection.getConnection();
		assertNotNull(con,"connection is null");
	}
	
	@AfterEach
	public void clear() {
		dbConnection = null;
	}
	
}
