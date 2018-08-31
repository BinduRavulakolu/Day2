package com.capgemini.day2.tests;

import java.util.function.Supplier;

public class Date {

	public static String checkDate(int x,int y,int z) {
		// TODO Auto-generated method stub
		String string="";
		int date=x;
		int month=y;
		int year=z;
		switch(month)
		{
		case 1: string="Jan";
		break;
		case 2: string="Feb";
		break;
		case 3: string="mar";
		break;
		case 4: string="Aprl";
		break;
		case 5: string="May";
		break;
		case 6: string="jun";
		break;
		case 7: string="jul";
		break;
		case 8: string="aug";
		break;
		case 9: string="sep";
		break;
		case 10: string="oct";
		break;
		case 11: string="nov";
		break;
		case 12: string="Dec";	
		break;
		default: System.out.println("wrong entered date "+string);
		}
		String converted=date+"/"+string+"/"+year;
		
		return converted;
	}

}
