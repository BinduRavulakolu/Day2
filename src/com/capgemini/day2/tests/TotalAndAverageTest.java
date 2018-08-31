package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TotalAndAverageTest {

	@Test
	void testTotAndAvgOfAllStudents() 
	{
		assertEquals(140,TotalAndAverage.checkTotalOfStudent1(30,45,65));
		assertEquals(170,TotalAndAverage.checkTotalOfStudent2(60,45,65));
		assertEquals(190,TotalAndAverage.checkTotalOfStudent3(50,55,85));
		assertEquals(46.00,TotalAndAverage.checkAverageOfStudent1(30,45,65));
		assertEquals(56.00,TotalAndAverage.checkAverageOfStudent2(60,45,65));
		assertEquals(63,TotalAndAverage.checkAverageOfStudent3(50,55,85));
	}
	@Test
	void testTotAndAvgOnSubjects()
	{
		assertEquals(140,TotalAndAverage.checkTotalOfAllInSubject1(30,60,50));
		assertEquals(165,TotalAndAverage.checkTotalOfAllInSubject2(45,55,65));
		assertEquals(215,TotalAndAverage.checkTotalOfAllInSubject3(65,65,85));
		assertEquals(46.00,TotalAndAverage.checkAverageOfAllInSubject1(30,60,50));
		assertEquals(55.00,TotalAndAverage.checkAverageOfAllInSubject2(45,55,65));
		assertEquals(71.00,TotalAndAverage.checkAverageOfAllInSubject3(65,65,85));
	}

}