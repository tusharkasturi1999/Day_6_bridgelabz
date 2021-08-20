package com.day8PracticeProblems;

import java.util.Scanner;

//This is the method to find triplets
public class SumEqualsZero {
	public static void sumequalszero(int[] arr, int n) {
		boolean found = false;
		int count = 0;
		for(int i=0; i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;j<n;j++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						count++;
						System.out.println("Triplets are "+arr[i]+","+arr[j]+","+arr[k]);
						found = true;
					}
					
					
				}
			}
		}
		if(found==false) {
			System.out.println("No triplets found");
		}
		System.out.println("Total triplet pairs : "+count);
	}
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array : ");
		int n = sc.nextInt(); //@param n This is the parameter used to intake value n 
		int[] arr = new int[n];
		System.out.println("Enter the elements of the array :");
		// This is the loop to intake values to arrays
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		sumequalszero(arr,n);
		sc.close();
	}

}
