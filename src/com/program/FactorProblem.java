package com.program;
import java.util.Scanner;

public class FactorProblem {
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value "); 
		int number=sc.nextInt();
		System.out.println("number is "+ number);
		for (int i=1; i <= number; i++) {
			if (number%i==0) {
				System.out.println("IT FACTORS BY "+ i);
			}
		}
	}
}
