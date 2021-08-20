package com.day8PracticeProblems;

import java.util.Scanner;

public class Vowels {
	public static void main( String[] args ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the alphabet to check : ");
		char c = sc.next().charAt(0); //@param c This is the parameter to input character c
		if(c =='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U') {
			System.out.println("It is a Vowel");
		}
		else {
			System.out.println("It is a Consonant");
		}
		sc.close();
	}

}
