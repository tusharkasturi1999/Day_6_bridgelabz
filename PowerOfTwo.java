package com.day8PracticeProblems;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main( String[] args ) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value of the power : ");
		int N =Math.abs(sc.nextInt()); //@param N This is the parameter used to intake value N 
		
		for (int i=0; i<= N; i++) //This is the method to print
		{
			System.out.println((int)Math.pow(2, i));
		}
		sc.close();
	}

}
