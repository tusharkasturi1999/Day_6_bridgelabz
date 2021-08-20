package com.day8PracticeProblems;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main( String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number to be Divided ");
		int Number = sc.nextInt();
		System.out.println("Enter the Divisor ");
		int Divisor = sc.nextInt();
		
		double Quotient = Number/Divisor; 
		double Remainder = (Number)%Divisor;
		
		System.out.println("Quotient : "+Quotient);
		System.out.println("Remainder : "+Remainder);
		sc.close();
	}

}
