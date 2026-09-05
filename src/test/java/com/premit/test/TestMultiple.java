package com.premit.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TestMultiple {
	
	@Test
	public void testMultipleConditions() {
		assertAll(
		()->{
			int expected = 20;
			int actual = 20;
			assertEquals(expected, actual);
		},
		()->{
			int expected = 20;
			int actual = 30;
			assertNotEquals(expected,actual);
		},
		()->{
			boolean expected = true;
		
			assertTrue(expected,()->"Matched");
		});
	}
}
