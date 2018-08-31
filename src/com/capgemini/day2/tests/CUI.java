package com.capgemini.day2.tests;

public class CUI {

	public static boolean checkUserPass(String username, String password) {
		String user="Bindu";
		String pass="!@bvyshu";
		if(user.equalsIgnoreCase(username)&&pass.equals(password))
		{
			return true;
		}
		else
		{
			
			return false;
	
		}
		}
	

}
