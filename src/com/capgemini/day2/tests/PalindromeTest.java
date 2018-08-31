package com.capgemini.day2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void test() {
		assertEquals(true,Palindrome.checkPalindrome(121));
		assertEquals(false,Palindrome.checkPalindrome(122));
		assertEquals(false,Palindrome.checkPalindrome(10));
		assertEquals(false,Palindrome.checkPalindrome(-121));
		assertEquals(false,Palindrome.checkPalindrome(121));
	}

}
