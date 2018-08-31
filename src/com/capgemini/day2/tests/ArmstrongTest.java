package com.capgemini.day2.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArmstrongTest {

	@Test
	void test() {
		assertEquals(true,Armstrong.checkArmstrong(153));
		assertEquals(false,Armstrong.checkArmstrong(238));
		assertEquals(true,Armstrong.checkArmstrong(-153));
	    assertEquals(false,Armstrong.checkArmstrong('c'));
	    assertEquals(false,Armstrong.checkArmstrong(0));
	    assertEquals(false,Armstrong.checkArmstrong(0x23));
	}

}
