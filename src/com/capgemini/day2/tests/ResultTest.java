package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ResultTest {

	@Test
	void test() {
		assertEquals("Passed",Result.checkResult(65,65,67));
		assertEquals("Promoted",Result.checkResult(65,65,55));
		assertEquals("Failed",Result.checkResult(65,55,55));
		assertEquals("Failed",Result.checkResult(0,0,0));
		assertEquals("Wrong",Result.checkResult(-8,-7,-6));
	}

}
