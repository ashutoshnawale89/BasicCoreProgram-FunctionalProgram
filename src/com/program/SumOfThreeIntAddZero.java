package com.program;

import java.util.Scanner;

public class SumOfThreeIntAddZero {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Size of Array  "); 
		int arr[] = new int[sc.nextInt()];
		 int length = arr.length;
		for (int i=0; i < length;i++) {	
		System.out.println("Enter The Value of array  "); 
		arr[i]=sc.nextInt();
		}
   

        boolean found = false;
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " "+ arr[j] + " "+ arr[k]);
                        found = true;
                    }
                }
            }
        }
 
        if (found == false)
            System.out.println(" not exist ");
    }
      
    }