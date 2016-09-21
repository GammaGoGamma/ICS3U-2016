package com.bayviewglen.dayseven;

public class ExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int secondsPerMinute= 60;   //declared variable but these values should NEVER change
		int minutesPerHour= 60;
		int hoursPerDay= 24;
		int daysPerYear= 365;
		int secondsPerYear  = secondsPerMinute  * minutesPerHour * hoursPerDay * daysPerYear;
		System.out.println("The number of seconds in a year is (wait for it...):"+ secondsPerYear);
		
		///////////////////////////////////////////////////////
		
		final int SECONDSPERMINUTE = 60;
		final int  MINUTESPERHOUR = 60;
		final int HOURSPERDAY = 24;
		final int DAYSPERYEAR = 365;
		
		final int SECONDSPERYEAR  = SECONDSPERMINUTE  * MINUTESPERHOUR * HOURSPERDAY * DAYSPERYEAR;
		System.out.println("The number of seconds in a year is (wait for it...):"+ secondsPerYear);
		
		double radius = 4.2;
		double area = Math.PI * Math.pow(radius, 2);
		
		/////////////////////////////////////////////////////////////
		
		
		final int  NUMSIDES = 6;

	}

}
