package com.day8PracticeProblems;
import java.util.Scanner;

public class FlipCoin {
	public static void main( String[] args ) {
		
		Scanner sc = new Scanner(System.in);

		int headcount =0;
		int tailcount =0; 
		
		System.out.println("Enter the number of flips: ");
		int N = Math.abs(sc.nextInt());
		for(int i=1;i<=N;i++) {
			Double toss = Math.random();
			
			if(toss<0.5) {
				tailcount++;
				System.out.println("Its a Tail");
			}
			else {
				headcount++;
				System.out.println("Its a Head");
			}
		}
		double headper = ((double)headcount/N)*100;
		double tailper = ((double)tailcount/N)*100;
		
		System.out.println("Percentage of Heads is " +headper+"%");
		System.out.println("Percentage of Tails is " +tailper+"%");
		sc.close();
	}

}
