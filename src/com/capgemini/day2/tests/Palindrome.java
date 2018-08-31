package com.capgemini.day2.tests;

public class Palindrome {

	public static boolean checkPalindrome(int input) {
		int number,mod,add=0,value;
		value=input;
	        number=value;
		
				while(value>0)
				{
				mod=value%10;
				add=add*10+mod;
				value=value/10;
				}
				if(number==add)
			{
					return true;
				}
				else
				{
					return false;
				}
	}

}
