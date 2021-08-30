package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

class StudentTest {

	@DisplayName("Name")
	@Test
	void test1() 
	{
		assertEquals("Aditya", Student.getName("Aditya"));
	}
	@DisplayName("ID")
	@Test
	void test2() 
	{
		assertEquals(001, Student.getId(001));
	}
	@DisplayName("Mobile Number")
	@Test
	void test3() 
	{
		assertEquals(8808215901L, Student.getMbno(8808215901L));
		assertEquals(8808214901L, Student.getMbno(8808214901L));
		assertEquals(8808315901L, Student.getMbno(8808315901L));
		assertEquals(8808415901L, Student.getMbno(8808415901L));
	}
	@DisplayName("CSV NAMES AND ID")
	@ParameterizedTest
	@CsvSource({"Aditya,001","Abhishek,002","Abhinav,003"})
	void test4(String name, int Id)
	{
		assertNotNull(name);
		assertNotNull(Id);
		System.out.println(name + " " + Id);
	}
	
	@Disabled
	@DisplayName("Disabled")
	@ParameterizedTest
	@CsvSource({"Aditya,001","Abhishek,002","Abhinav,003"})
	void test5(String name, int Id)
	{
		assertNotNull(name);
		assertNotNull(Id);
		System.out.println(name + " " + Id);
	}
	
	@DisplayName("Check Length")
	@ParameterizedTest
	@CsvSource({"Aditya,001","Abhishek,002","Abhinav,003"})
	void test6(String name, int Id)
	{
		assertNotNull(name);
		assertNotNull(Id);
		assertTrue(name.length()>=5);
		System.out.println(name + " length is greater than 5");
	}
	
	@DisplayName("Check Length")
	@ParameterizedTest
	@CsvSource({"8808215901","8808562415","8745968521"})
	void test6(String num)
	{
		
		assertNotNull(num);
		assertTrue(num.length() >= 5);
		System.out.println(num + " is valid mobile number");
	}
	
	@ParameterizedTest
	@DisplayName("Method Test")
	@MethodSource("com.test.Student#studentName")
	void test7(String alpha)
	{
		assertNotNull(alpha);
		System.out.print(alpha + " ");
	}
	
	
	@ParameterizedTest
	@DisplayName("NotNull Test")
	@MethodSource("com.test.Student#studentName")
	void test8(String alpha)
	{
		assertTrue(alpha!=null);
		System.out.print(alpha + " ");
	}
	
	@Disabled
	@ParameterizedTest
	@DisplayName("Assert Same Test")	
	void test9(String alpha)
	{
		Student s = new Student("A",1);		
		Student s1 = new Student("B",2);			
		assertSame(s,s1);		
	}
}
