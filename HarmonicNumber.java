package com.day8PracticeProblems;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main( String[] args ) {
		int N=0;
		double val=0;
		Scanner sc = new Scanner(System.in);
		while(N==0) {
		System.out.println("Enter the value for N : ");
		N = sc.nextInt(); //@param N This is the parameter used to intake value N 
		}
		
		for(int i =1; i<=N;i++) {
			val = val + (1.0/i);
		}
		System.out.println(val);
		sc.close();
	}

}
