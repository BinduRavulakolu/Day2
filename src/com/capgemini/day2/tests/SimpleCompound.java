package com.capgemini.day2.tests;

import java.text.DecimalFormat;

public class SimpleCompound {

	public static double simple(double principle, double time, double rate) 
	{
		DecimalFormat df = new DecimalFormat("#.##");   
		double value,simple;
		value=(principle*time*rate);
		simple=value/100;
		simple = Double.valueOf(df.format(simple));
	    return simple;
	}

	public static double compound(double principle, double time, double rate)
	{
		DecimalFormat df = new DecimalFormat("#.##");   
		double compound;
		compound=principle*Math.pow(1.0+rate/100.0,time)-principle;
		compound = Double.valueOf(df.format(compound));
		return compound;
	}
	

}
