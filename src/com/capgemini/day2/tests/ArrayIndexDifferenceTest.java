package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayIndexDifferenceTest {

	@Test
	void test() {
		assertEquals(true,ArrayindexDifference.CheckDifference(new int[] {3,2,4,5,6,2},5));
	}

}
