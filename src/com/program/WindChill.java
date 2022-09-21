package com.program;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the Temperature");
		double temp=sc.nextDouble();
		System.out.println("enter the Wind Speed");
		double windSpeed=sc.nextDouble();
		if (temp >= 50 && windSpeed > 3 && windSpeed < 120) {
			double weather=35.74+(0.6215*temp)+(((0.4275*temp)+(35.75))*Math.pow(windSpeed,0.16));
			System.out.println(weather);
		}
		else 
			System.out.println("The Calculaton is Not Valid For This Temp & WindSpeed");
	}	 
}
