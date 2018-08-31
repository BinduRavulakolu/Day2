package com.capgemini.day2.tests;

public class ArrayName {

	public static boolean checkArrayName(String[] names, String checkName) {
		int flag=0;
		for(int i=0;i<28;i++)
		{
			String match=names[i];
			if(checkName.equals(match))
			{
				flag++;
			}
	
		}
		if(flag!=0)
		{
		return true;
		}
		else
		{
			return false;
		}
	}

}
