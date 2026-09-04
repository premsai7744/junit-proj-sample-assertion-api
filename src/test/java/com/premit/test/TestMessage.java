package com.premit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.premit.demo.Message;

public class TestMessage {
	
	Message msg = null;
	String expected = null;
	String actual = null;
	
	@BeforeEach
	public void setUp() {
		msg = new Message();
		expected = "Welcome to Ram";
	}
	
	@Test
	public void testShowMessage() {
		actual = msg.showMessage("Ram");
		assertEquals(expected, actual,"expected and actual both are not matching.");
	}
	
	@AfterEach
	public void clear() {
		msg = null;
		expected = null;
		actual = null;
	}
}
