package com.program;

import java.util.Scanner;

public class EvenOddNum {
	public static void main(String[] args) { 
			 Scanner sc=new Scanner(System.in);
				System.out.println("Enter The Value "); 
				int number=sc.nextInt();	
	    	   if (number%2==0) {
	    		   System.out.println(" THE "+ number +"  IS THE EVEN NUMBER" );
	    	   } 
	    	   else 
	    	   {   System.out.println(" THE "+ number +"  IS THE ODD NUMBER" );
	       }
		}
}