package com.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.ArmstrongOrNot;

class TestArmstrong {

	@Test
	void test() {
//		fail("Not yet implemented");
		assertEquals(true, ArmstrongOrNot.isArm(153));
		assertEquals(true, ArmstrongOrNot.isArm(370));
		assertEquals(true, ArmstrongOrNot.isArm(371));
		assertEquals(true, ArmstrongOrNot.isArm(407));
		assertEquals(false, ArmstrongOrNot.isArm(20));
		System.out.println("All Test Cases Passed!");
	}

}
