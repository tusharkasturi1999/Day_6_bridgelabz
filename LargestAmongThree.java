package com.day8PracticeProblems;

import java.util.Scanner;

public class LargestAmongThree {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers :");
		int a = sc.nextInt(); //@param a This is the parameter used to intake value a 
		int b = sc.nextInt(); //@param b This is the parameter used to intake value b 
		int c = sc.nextInt(); //@param c This is the parameter used to intake value c 
		sc.close();
		if(a>b&&a>c) {
			System.out.println("The largest among the three is "+a);
		}
		if(b>a&&b>c) {
			System.out.println("The largest among the three is "+b);
		}
		if(c>a&&c>b) {
			System.out.println("The largest among the three is "+c);
		}
			
	}

}
