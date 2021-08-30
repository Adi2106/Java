package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.PrimeOrNot;

class TestPrime {

	@Test
	void test() {
//		fail("Not yet implemented");
		assertEquals(true, PrimeOrNot.isPrime(5));
		assertEquals(true, PrimeOrNot.isPrime(2));
		assertEquals(false, PrimeOrNot.isPrime(9));
		System.out.println("All Test Cases Passed!");
	}

}
