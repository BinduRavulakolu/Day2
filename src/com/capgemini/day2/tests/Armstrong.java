package com.capgemini.day2.tests;

public class Armstrong {

	public static boolean checkArmstrong(int i) {
		int number=i,digit,sum=0;
		if(number==0)
		{
			return false;
		}
		else
		{
		while(number!=0)
		{
			digit=number%10;
			sum=sum+(digit*digit*digit);
			number=number/10;
		}
		if(i==sum)
		{
		   return true;	
		}
		else
		{
		return false;
	    }
		}
	}

}
