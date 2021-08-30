package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

class ParaTestAssgn {

	@ParameterizedTest
	@DisplayName("Testing Even")
	@ValueSource(ints = {2,4,8,6,10,12})
	void testEven(int n) {
//		fail("Not yet implemented");
		assertTrue(n%2==0);
//		System.out.println("All Values Passed");
	}
	@ParameterizedTest
	@DisplayName("Test Strings")
	@ValueSource(strings= {"aditya", "enfec", "solutions"})
	void testString(String s) {
//		fail("Not yet implemented");
		assertFalse(s.length()<5);
//		System.out.println("All Values Passed");
		
	}
	@ParameterizedTest
	@DisplayName("Test Strings")
	@ValueSource(doubles= {50.0, 55.0, 25.0, 35.0})
	void testDoubls(Double d) {
//		fail("Not yet implemented");
		assertTrue(d%5==0);		
		
	}
	@ParameterizedTest
	@DisplayName("CSV FILE TEST")
	@CsvFileSource(resources="Names.csv")
	void testCsv(String name, int id)
	{
		System.out.println("Name-> " + name + "\t"+"Id-> " + id);
		assertNotNull(name);
	}
	
	@ParameterizedTest
	@DisplayName("Method TEST")	
	@MethodSource("fruits")
	void testMethod(String name)
	{
		System.out.println("Name-> " + name );
		assertNotNull(name);
	}
	public static Stream<String> fruits()
	{
		return Stream.of("Apple","banana","orange","grapes");
	}
	
	
	
	@DisplayName("CSV Parameterized")
	@ParameterizedTest(name = "{index} ==> the quantity of ''{0}'' is {1}")
	@CsvSource({"apple,1" ,"banana,2","grapes,3"})
	void diplay(String n, int nu)
	{
		assertNotNull(n);
		assertNotNull(nu);
		System.out.println(n + ", " + nu );
	}
	
	@Disabled
	@DisplayName("Disabled Annotation")
	@ParameterizedTest(name = "{index} ==> the quantity of ''{0}'' is {1}")
	@CsvSource({"apple,1" ,"banana,2","grapes,3"})
	void diplayy(String n, int nu)
	{
		assertNotNull(n);
		assertNotNull(nu);
		System.out.println(n + ", " + nu );
	}

}
