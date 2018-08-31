package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IncomeTaxTest {

	@Test
	void test() {
		assertEquals(0, IncomeTax.checkTax(175000));
		assertEquals(25120, IncomeTax.checkTax(251200));
		assertEquals(71650, IncomeTax.checkTax(358250));
	}

}
