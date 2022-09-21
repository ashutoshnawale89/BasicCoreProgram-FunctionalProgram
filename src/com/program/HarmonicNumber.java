package com.program;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Value"); 
		int num=sc.nextInt(); 
		double value=1;
	for (int i=1; i < num;i++ ) {
	   value=value+(1/i);
	}
	System.out.println(value);
	}
}
