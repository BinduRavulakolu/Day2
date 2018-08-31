package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayElementSearchTest {

	@Test
	void test() {
		assertEquals(true,ArrayElementSearch.searchElement(new int[] {1,2,3,4,5,6,7},6));
	}

}
