package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.MyClass;

class TestDifferentMethods {

	static MyClass m;
//	@BeforeEach
	@BeforeAll
	static void inti()
	{
		m=new MyClass();
		System.out.println("Initialized");
	}
	@Test
	void testS() {
//		fail("Not yet implemented");
		assertEquals(4,m.sqr(2));
		System.out.println("Square Test Case Passed");
	}
	@Test
	void testC() {
//		fail("Not yet implemented");
		assertEquals(27,m.cube(3));
		System.out.println("Cube Test Case Passed");
	}
//	@AfterEach
	@AfterAll
	static void print()
	{
		System.out.println("Cleaned!");
	}
	
}
