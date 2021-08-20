package com.day8PracticeProblems;

import java.util.Scanner;

public class EvenOdd {
	public static void main( String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check : ");
		int number = sc.nextInt(); //@param number This is the parameter to select number to be tested 
		if(number%2==0) {
			System.out.println("The number "+number+" is Even");
		}
		else {
			System.out.println("The number "+number+" is ODD");
		}
		sc.close();
		
	}

}
