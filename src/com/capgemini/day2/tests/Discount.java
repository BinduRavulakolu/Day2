package com.capgemini.day2.tests;

import java.text.DecimalFormat;

public class Discount {

	public static double printDiscount(double newItem) {
		DecimalFormat df = new DecimalFormat("#.##");
		double discount;
		discount=(newItem*35)/100;
		discount= Double.valueOf(df.format(discount));
		return discount;
	}

}
