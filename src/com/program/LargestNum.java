package com.program;

import java.util.Scanner;

public class LargestNum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value 1st Value"); 
		int num1=sc.nextInt();
		System.out.println("Enter The Value 2nd  Value"); 
		int num2=sc.nextInt();
		System.out.println("Enter The Value 3rd  Value"); 
		int num3=sc.nextInt();
		int greatervalue1=0;
		int greatervalue2=0;

		// CONSIDER THE GRATER VALUE IN "NUM1  &  NUM2"
		if (num1 > num2) {
			greatervalue1=num1;
		} else {
			greatervalue1=num2;
		}

		//  CONSIDER THE GRATER VALUE IN "GRATERVALUE1  &  NUM3"
		if (greatervalue1 > num3) {
			greatervalue2=greatervalue1;
		} else {
			greatervalue2=num3;
		}
		System.out.println("GREATER VALUE IS "+ greatervalue2);
}
}
