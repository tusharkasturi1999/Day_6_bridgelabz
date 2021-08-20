package com.day8PracticeProblems;

import java.util.Scanner;

public class LeapYear {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		
		int year = 0; //@param year This is the parameter used to intake value for the year to be tested 
		boolean leap = false;
		
		while( year<999 || year>10000) {
			System.out.println("Enter 4 digit year :");
			if (sc.hasNextInt()) {
				year = sc.nextInt();
			}
		}
		
	    // if the year is divided by 4
	    if (year % 4 == 0) {

	      // if the year is century
	      if (year % 100 == 0) {

	        // if year is divided by 400
	        // then it is a leap year
	        if (year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      }
	      
	      // if the year is not century
	      else
	        leap = true;
	    }
	    
	    else
	      leap = false;

	    if (leap)
	      System.out.println(year + " is a leap year.");
	    else
	      System.out.println(year + " is not a leap year.");
	    sc.close();
	  }

		
}

