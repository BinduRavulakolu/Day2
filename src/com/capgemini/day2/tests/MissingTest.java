package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MissingTest {

	@Test
	void test() {
	     assertEquals(3,Missing.identifyMissing(new int[] {1,2,4,5}));
	     assertEquals(4,Missing.identifyMissing(new int[] {1,2,3,5,6,7,8,9}));
	     
	}

}
