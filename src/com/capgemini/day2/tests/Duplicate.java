package com.capgemini.day2.tests;

public class Duplicate {

	public static String deleteDuplicate(String input) {
		String output = new String();
        char c;

        for (int i = 0; i < input.length(); i++) {
        	 c=input.charAt(i);
        	 if(c!=' ')
        	 {
        		 output=output+c;
        		 input=input.replace(c, ' ');
        	 }
            
                }
        

        return output;

	}
	

}
