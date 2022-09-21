package com.program;

import java.util.Scanner;

public class SwapNumber {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Value Smallest Value"); 
			int Variable1=sc.nextInt();
			System.out.println("Enter The Value Largest  Value"); 
			int Variable2=sc.nextInt();
			
		    int num=Variable1;
		    
		    Variable1=Variable2;
		    Variable2=num;

		    System.out.println("Variable1 =  "+Variable1 + "  &&&  " + "Variable2  = "+ Variable2);
		  
		  }
		}