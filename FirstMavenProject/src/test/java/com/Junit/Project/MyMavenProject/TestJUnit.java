package com.Junit.Project.MyMavenProject;

import static org.junit.jupiter.api.Assertions.*;

class TestJUnit {

	@org.junit.jupiter.api.Test
	
	void test1() {
		Object o1 = null;
		Object o2 = null;
		assertSame(o1,o2);
		System.out.println("AssertSame Test Case Passed");
	}
	
//	void test2() {
//		Integer o1 = 5;
//		Integer o2 = 5;
//		assertSame(o1,o2);		
//		System.out.println("AssertSame Test Case2 Passed");
//	}
}
