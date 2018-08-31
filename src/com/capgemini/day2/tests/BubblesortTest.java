package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubblesortTest {

	@Test
	void test() {
		assertArrayEquals(new int[] {1,5,6,7,12,14,19,23,26,35}, Bubblesort.sortedElements(new int[]{5,12,14,6,19,1,23,26,35,7}));
	}

}
