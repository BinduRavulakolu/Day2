package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayNameTest {

	@Test
	void test() {
	assertEquals(true,ArrayName.checkArrayName(new String[] {"Dave","Ann","George","Sam","Ted","Gag","Saj","Agati","Mary","Sam","Ayan","Dev","kity","Meery","Smith","Jhonson","Bill","Williams","Jones","Brown",
  		  "Davis","Miller","Wilson","Moore","Taylor","Anderson","Thomas","jackson"},"Sam"));
	}

}
