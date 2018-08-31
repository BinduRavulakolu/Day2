package com.capgemini.day2.tests;

//import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MultidimentsionTest {
	@Test
	void test() {
		assertEquals(true, Multidimensional.search(new int [][] {{1,2,3,4},{4,5,6,7},{8,9,10,11}},10));
		
	}
}
