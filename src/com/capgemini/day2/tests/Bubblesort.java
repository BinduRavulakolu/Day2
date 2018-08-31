package com.capgemini.day2.tests;

public class Bubblesort {

	public static int[] sortedElements(int[] inputElements) {
		int[] output=new int[10];
		for(int i=0;i<=14;i++)
		{
			for(int j=i+1;j<=14;j++)
			{
				if(inputElements[i]>inputElements[j])
				{
					int temporary = inputElements[i];
					inputElements[i]=inputElements[j];
					inputElements[j]=temporary;
				}
			}
		}
		for(int i=0;i<=14;i++)
		{
			output[i]=inputElements[i];
		}
		return inputElements;
	}
	

}
