package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

	@Test
	void test() {
		assertEquals("8/sep/2018",Date.checkDate(8,9,2018) );
		assertEquals("16/jun/2018",Date.checkDate(16,6,2018) );
		assertEquals("16/6/2018",Date.checkDate(16,6,2018) );
	}
}
