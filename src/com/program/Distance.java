package com.program;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value  ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		double distance = Math.sqrt((num1*num1) + (num2*num2));
		System.out.println(" The distance is  "+distance);
	}
}