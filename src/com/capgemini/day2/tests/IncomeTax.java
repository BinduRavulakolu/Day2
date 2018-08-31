package com.capgemini.day2.tests;

public class IncomeTax {

	public static double checkTax(double i) {
	        double income,tax=0;
	        income=i;
	        if(income<0)
	    	{
	    		return 0;
	    	
	    	}
	    	else
	    	{
	    		if(income>=0&&income<=180000)
	    		{
	    			tax=0;
	    			return tax;
	    		}
	    		else if(income>=180001&&income<=300000)
	    		{
	    			tax=(income*10)/100;
	    			return tax;
	    		}
	    		else if(income>=300001&&income<=500000)
	    		{
	    			tax=(income*20)/100;
	    			return tax;
	    		}
	    		else if(income>=500001&&income<=1000000)
	    		{
	    			tax=(income*30)/100;
	    			return tax;
	    		}
	    		
	    	}
	        return 0;
	}

}
