package com.maven.collab.NEW_MAVEN_H;

public class LeapYearOrNot {

	public static void main(String[] args) {
	int year = 2024;
	
	//Conditions to determine a year is leap or not
	//1. the year is divisible by 400
	//2. the year is divisible by 4 but divisible by 100
	
	if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
		System.out.println("year 2024 is a leap year");
	}else {
		System.out.println("year 2024 is not a leap year");
	}

	}

}
