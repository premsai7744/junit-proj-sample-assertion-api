package com.premit.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestArrayValues {
	
	@Test
	public void testArrayVal() {
		int expected[] = {10,20,30};
		int actual[] = {10,20,30};
		
		assertArrayEquals(expected, actual);
	}
}
