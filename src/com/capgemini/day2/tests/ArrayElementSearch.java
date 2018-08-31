package com.capgemini.day2.tests;

public class ArrayElementSearch {

	public static boolean searchElement(int[] inputArray, int keyElement) {
//		int flag=0;
		for (int i=0;i<=inputArray.length;i++) 
		{
			if(keyElement==inputArray[i])
			{
				return true;
			}
			else
			{
				continue;
			}
		}
		return false;
	
	}

}
