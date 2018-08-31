package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseTest {

	@Test
	void test() {
		assertEquals("stel og ot hcnul ",Reverse.stringReverse("lets go to lunch"));
	}

}
