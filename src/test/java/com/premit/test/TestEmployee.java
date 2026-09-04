package com.premit.test;

import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class TestEmployee {
	
	@BeforeAll
	public static void setUpOnce() {
		System.out.println("BEFORE-ALL");
	}
	
	@BeforeEach
	public void setUp() {
		System.out.println("BEFORE-EACH");
	}
	
	@Tag("dev")
	@Order(1)
	@Test
	public void testSave() {
		System.out.println("TEST-SAVE");
	}
	
	@Disabled
	@Order(2)
	@Test
	public void testUpdate() {
		System.out.println("TEST-UPDATE");
	}
	
	@Tag("uat")
	@Order(3)
	@Test
	public void testDelete() {
		System.out.println("TEST-DELETE");
	}
	
	@Tag("prod")
	@DisplayName("TEST-MULTIPLE-EMPLOYEES")
	@Order(4)
	@RepeatedTest(value=3,name="{displayName}-{currentRepetition}/{totalRepetitions}")
	public void testMultiple(TestInfo testInfo) {
		System.out.println(testInfo.getDisplayName());
		
	}
	
	@AfterEach
	public void clear() {
		System.out.println("AFTER-EACH");
	}
	
	@AfterAll
	public static void clearAllOnce() {
		System.out.println("AFTER-ALL");
	}
	
}
