package com.rakuten.training.basics;

/*Find the day of the week of a given date

Create a class DOWFinder and Implement a Java-method called findDOW(int day,int month,int year)that prints out the day of the week for a given day (1..31), month (1..12) and year.

The day of the week of dates between March 1900 and February 2100 can be calculated as follows:

First, you have to calculate the total number of days from 1900/1/1 to the given date (see below, for details). Secondly, you divide this number by 7 with integer remainder: this now is the day of the week, with 0 as sunday, 1 as monday, etc.

To calculate the total number of days you have to implement the following steps:

Subtract 1900 from the given year and multiply the result by 365
Add the missing leaps years by adding (year - 1900) / 4.
If the year itself is a leap year and the month is January or February, you have to subtract 1 from the previous result.
Now add the all days of the year up to the given one to the result (in case of february always 28, because the additional day for a leap year already have been added).
*/
public class DOWFinder {
	public String findDOW(int day, int month, int year) {
		int numberOfDays = (year - 1900)*365;
		numberOfDays += (year - 1900)/4;
		switch(month) {
		case 12: 
			numberOfDays += 30;
		case 11:
			numberOfDays += 31;
		case 10: 
			numberOfDays += 30;
		case 9:
			numberOfDays += 31;
		case 8: 
			numberOfDays += 31;
		case 7:
			numberOfDays += 30;
		case 6: 
			numberOfDays += 31;
		case 5:
			numberOfDays += 30;
		case 4: 
			numberOfDays += 31;
		case 3:
			numberOfDays += 28;
		case 2: 
			numberOfDays += 31;
		}
		numberOfDays += day;
		if(numberOfDays%4 == 0 && month<=2) {
			numberOfDays--;
		}
		int dowIndex = numberOfDays % 7;
		String[] days = {"Sunday", "Monday", "Tuesday","Wednesday","Thrusday","Friday","Saturday"};
		return days[dowIndex];
	}
	public static void main(String[] args) {
		DOWFinder f = new DOWFinder();
		String a = f.findDOW(1,6,1999);
		System.out.println(a);
		
	}

}
