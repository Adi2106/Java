package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParametetrizedTesting {

	@ParameterizedTest
	@ValueSource(ints = {1,2,3,4})
	@DisplayName("Hello World")
	void test(int arr) {
//		fail("Not yet implemented");
		assertTrue(arr>0);
		System.out.println(arr);
		
	}

}
