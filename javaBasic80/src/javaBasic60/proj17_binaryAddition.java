package javaBasic60;

import java.util.Scanner;

public class proj17_binaryAddition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 0;//index
		int r = 0;//remainder 
//		10 to reduce sigfig and remainder
//		2 for 0 or 1 r  
		
		int[] sum = new int[20];
		System.out.print("Type first binary number: ");
		long bin1 = sc.nextLong();

		  
		System.out.print("Type second binary number: ");
		long bin2 = sc.nextLong();
		
		while (bin1 != 0 || bin2 != 0) {
		sum[i++] = (int)((bin1 % 10 + bin2 % 10 + r) % 2);
		r = (int)((bin1 % 10 + bin2 % 10 + r) / 2);
		bin1 = bin1 / 10;
		bin2 = bin2 / 10;
		}
		  
		if (r != 0) {
		 sum[i++] = r;
		}
		--i;
		  
		System.out.print("Sum: ");
		while (i >= 0) {
		 System.out.print(sum[i--]);
		}
		

		sc.close();
	}

}
