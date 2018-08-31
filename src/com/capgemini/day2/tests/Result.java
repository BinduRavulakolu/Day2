package com.capgemini.day2.tests;

public class Result {

	public static String checkResult(int subject1, int subject2, int subject3) {
		if(subject1<0&&subject2<0&&subject3<0)
		{
			return "Wrong";
		}
		else
		{
		if(subject1>=60&&subject2>=60&&subject3>=60)
		{
			return "Passed";
		}
		else if((subject1>=60&&subject2>=60)||(subject2>=60&&subject3>=60)||(subject1>=60&&subject3>=60))
		{
			return "Promoted";
		}
		else if((subject1<60||subject2<60||subject3<60)||(subject1<60&&subject2<60&&subject3<60))
		{
			return "Failed";
		}
		else
		{
			return "Wrong";
		}
		}
	}

}
