package com.day8PracticeProblems;

import java.util.Scanner;

public class Array2D {
	
	public static void create(int[][] arr, int m, int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of the array : ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		sc.close();
	}
	public static void print(int[][] arr, int m, int n) {
		System.out.println("The elements of the array are : ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(+arr[i][j]+"\t");
			}
			System.out.println("");
		}
			
	}
	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of M & N for a MXN Array : ");
		int m = sc.nextInt(); //@param m This is the parameter for rows 
		int n = sc.nextInt(); //@param n This is the parameter for column 
		int[][] arr = new int[m][n];
		create(arr,m,n); //This method is used to create an array
		print(arr,m,n);  //This method is used to print the array
		sc.close	();
	}

}
