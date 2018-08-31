package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
	void test() {
		assertEquals(25,Square.checkSquare(5));
		assertEquals(625,Square.checkSquare(25));
		assertEquals(25,Square.checkSquare(-5));
		assertEquals(25,Square.checkSquare(5.0));
		assertEquals(9801,Square.checkSquare('c'));
	}

}
