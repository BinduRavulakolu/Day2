package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiscountTest {

	@Test
	void test() {
		assertEquals(1247.75,Discount.printDiscount(3565.00));
	}

}
