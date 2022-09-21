package com.program;

import java.util.Scanner;

public class QuetRemainder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value "); 
		int number=sc.nextInt();
		 int divisible_number=4;
		 int quotient=1;
		 int remainder=1;
		 // Quotient & Remainde
		 quotient=number / divisible_number ;
		 remainder=number % divisible_number ;

	 System.out.println("Quotient value= "+quotient);
	 System.out.println("Remainder value= "+remainder);
	}
	}
