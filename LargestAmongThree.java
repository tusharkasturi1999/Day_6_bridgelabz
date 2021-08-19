package com.day8PracticeProblems;

import java.util.Scanner;

public class LargestAmongThree {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three Numbers :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
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
