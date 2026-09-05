package com.premit.test;

import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.premit.demo.DbConnection;

public class TestDbConnection {
	
	public DbConnection dbConnection = null;
	public Connection con1 = null;
	public Connection con2 = null;
	
	@BeforeEach
	public void setUp() {
		dbConnection = new DbConnection();
	}
	
	@Test
	public void testGetConnection() {
		con1 = dbConnection.getConnection();
		con2 = dbConnection.getConnection();
		
		if(con1==null || con2==null) {
			fail("Connections are not created.");
		}
		
	}
	
	@AfterEach
	public void clear() {
		dbConnection = null;
	}
	
}
