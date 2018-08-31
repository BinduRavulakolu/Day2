package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DeleteWordTest {

	@Test
	void test() {
		assertEquals("lets go to lunch ",DeleteWord.removeDuplicates("lets go go to lunch"));
	}

}
