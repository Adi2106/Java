package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import com.MyClass;

class MyClasstest {

	@Test
	void testAdd() {
//		fail("Not yet implemented");
		assertEquals(10, MyClass.add(5, 5));
		assertEquals(10, MyClass.add(6, 4));
		assertEquals(10, MyClass.add(3, 7));
		assertEquals(10, MyClass.add(2, 8));
//		System.out.println("All Addition Test Cases Passed!");
	}
	@Test
	void testSub() {
		assertEquals(0, MyClass.sub(0, 0));
		assertEquals(0, MyClass.sub(5, 5));
		assertEquals(3, MyClass.sub(8, 5));
		assertEquals(2, MyClass.sub(10, 8));
//		System.out.println("All Subtration Test Cases Passed!");
	}
	@Test
	void testSquare() {
		assertEquals(4, MyClass.sqr(2));
		assertEquals(16, MyClass.sqr(4));
		assertEquals(256, MyClass.sqr(16));
		assertEquals(1024, MyClass.sqr(32));
//		System.out.println("All Square Test Cases Passed!");
	}
	@Test
	void testCube() {
		assertEquals(8, MyClass.cube(2));
		assertEquals(27, MyClass.cube(3));
		assertEquals(64, MyClass.cube(4));
		assertEquals(125, MyClass.cube(5));
//		System.out.println("All Cube Test Cases Passed!");
	}	
	
	@ParameterizedTest
	@DisplayName("Method Test")
	@MethodSource("com.MyClass#func")
	void test(String alpha)
	{
		assertNotNull(alpha);
		System.out.println(alpha);
	}

}
