package com.capgemini.day2.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CUITest {

	@Test
	void test() {
		assertEquals(true, CUI.checkUserPass("Bindu","!@bvyshu"));
		assertEquals(false, CUI.checkUserPass("Bfndu","!@bvyshu"));
		assertEquals(false, CUI.checkUserPass("Bindu",""));
	}

}
