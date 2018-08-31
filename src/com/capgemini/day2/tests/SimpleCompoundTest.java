package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleCompoundTest {

	@Test
	void test() {
		 assertEquals(10.00,SimpleCompound.simple(100,5,2));
		 assertEquals(10.41,SimpleCompound.compound(100,5,2));
		}

}
