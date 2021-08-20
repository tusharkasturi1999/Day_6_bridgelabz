package com.day8PracticeProblems;

import java.util.Scanner;

public class Quadratic {
	//This is the method to calculate roots
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
		double a=sc.nextDouble();//@param a This is the parameter used to intake value a
		double b=sc.nextDouble();//@param b This is the parameter used to intake value b 
		double c=sc.nextDouble();//@param c This is the parameter used to intake value c 
		quadratic(a,b,c);
		sc.close();
	}

}
