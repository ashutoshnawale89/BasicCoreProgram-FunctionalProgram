package com.program;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Put The Year in 4 Digit s ");
		int year=sc.nextInt();
		if (year >= 1000) {
		if (year%4==0)
			System.out.println(year+"  is the Leap Year");
		else 
			System.out.println(year+"  is Not the Leap Year");
		}
	else {
		System.out.println(year+"  The Input User is Wrong");
	}
}

}
