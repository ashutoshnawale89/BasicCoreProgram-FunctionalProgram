package com.program;

import java.util.Scanner;

public class Two_D_Array {
	 public static void main(String[] args)
	    {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Value of row  "); 
			int row=sc.nextInt();
			System.out.println("Enter The Value of Column  "); 
			int column=sc.nextInt();
	        int[][] arr = new int[row][column];
	       
	 for (int i=0; i < row; i++) {
		 for (int j=0; j < column ; j++) {
			 System.out.println("Enter The Value Of Row & Column  "); 
			 arr[i][j]=sc.nextInt();
		 }
	 }
	 for (int i = 0; i < row; i++)
         for (int j = 0; j < column; j++)
                 System.out.println("arr[" + i + "]["+ j + "] = "+ arr[i][j]);
 
	    }
	}
