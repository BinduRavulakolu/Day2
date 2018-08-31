package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DplicateTest {

	@Test
	void test() {
		assertEquals("abcd",Duplicate.deleteDuplicate("aabbccdd"));
		assertEquals("cdug",Duplicate.deleteDuplicate("cdugcdug"));
	}

}
