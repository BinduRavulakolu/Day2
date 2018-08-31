package com.capgemini.day2.tests;

public class Missing {
	public static int identifyMissing(int[] array) {
		int total;
		int length=array.length;
		 total=((length+1)*(length+2))/2;
		for (int i = 0; i <length; i++) {
			total-=array[i];
		}
		return total;
		
	}

}
