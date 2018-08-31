package com.capgemini.day2.tests;
public class ArrayindexDifference {

	public static boolean CheckDifference(int[] arrayElements, int keyElement) {
		int start=0;
		 for(int i=0;i<arrayElements.length;i++)
		    {
		    	for(int j=i+1;j<arrayElements.length;j++)
		    	{
		    	if(arrayElements[i]==arrayElements[j])
		    	{
		    		start=Math.abs(i-j);
		    	}
		    	}
		    }
		    	
	    	
		    	if(start<=keyElement)
	    		{
	    			return true;
	    		}
	    		else
	    		{
	    			return false;
		       }
		
	}

}
