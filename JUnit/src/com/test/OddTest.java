package com.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.OddOrNot;

class OddTest {

	@Test
	void test() {
//		fail("Not yet implemented");
		assertEquals(true, OddOrNot.Odd(5) );
		assertEquals(false, OddOrNot.Odd(6) );		
		System.out.println("All Test Cases passed!");
	}

}
