package com.day8PracticeProblems;

import java.util.Scanner;

public class Quadratic {
	public static void quadratic(double a, double b, double c) {
		double delta = (b*b)-(4*a*c);
		double x1 = (-b+Math.sqrt(delta))/(2*a);
		double x2 = (-b-Math.sqrt(delta))/(2*a);
		System.out.println("Root1 of x is : "+x1);
		System.out.println("Root2 of x is : "+x2);
	}
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values for a, b & c respectively :");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		quadratic(a,b,c);
		sc.close();
	}

}
