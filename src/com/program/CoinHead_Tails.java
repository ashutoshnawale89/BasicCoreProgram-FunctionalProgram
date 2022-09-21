package com.program;

import java.util.Random;

public class CoinHead_Tails {
	
   public static void main(String args[]) {
	   Random random = new Random();
	   int coin=random.nextInt(100)+1;
	   if (coin > 50)
		   System.out.println("The coin is Head");
	   else 
		   System.out.println("The coin is Tail");
}
}
