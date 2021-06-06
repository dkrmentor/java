package com.softwareconstruction.assignment01;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import testMethod.AllMehtods;

class CalendarTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		  System.out.println("@BeforeAll executed");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		 System.out.println("@AfterAll executed");
	}

	@BeforeEach
	void setUp() throws Exception {
		 System.out.println("@BeforeEach executed");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("@AfterEach executed");
	}
	@Test
	void printAgenda2() {
		System.out.println("======TEST 1 EXECUTED=======");
		Calendar test = new Calendar();
		String result = test.printAgenda(3,4);
		assertEquals("Agenda for "+3+"/"+4+":\n", result); 
    	}
	
	@Test
	void printAgenda() {
		System.out.println("======TEST 2 EXECUTED=======");
		Calendar test = new Calendar();
		String result = test.printAgenda(3);
		assertEquals("Agenda for "+3+":\n", result); 
    
	}
	
	
	
}
