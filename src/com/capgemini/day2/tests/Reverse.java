package com.capgemini.day2.tests;

public class Reverse 
{

	public static Object stringReverse(String inputString) {
		String word[]=inputString.split(" ");
        String last="";
        for(int i=0;i<word.length;i++)
        {
        	String rev="";
        	for(int j=word[i].length()-1;j>=0;j--)
        	{
        		rev+=word[i].charAt(j);
        	}
        	last+=rev+" ";
        	}
	return last;
	}
	

}
