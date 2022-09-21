package com.program;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Single Character "); 
        String ch =sc.next();

        if(ch == "a" || ch == "e" || ch == "i" || ch == "o" || ch == "u"||
           ch == "A" || ch == "E" || ch == "I" || ch == "O" || ch == "U" )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");

    }
}
