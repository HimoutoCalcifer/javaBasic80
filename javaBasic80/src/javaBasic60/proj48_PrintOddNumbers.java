package javaBasic60;

import java.util.Scanner;

public class proj48_PrintOddNumbers {

	static int x;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number(ex.100) to get odd number list: ");
		x = sc.nextInt();
		
		print_odd(x);
		
		sc.close();

	}

	static void print_odd(int odd) {
		for (int i = 1; i < x; i++) {
			if (i % 2 != 0)
				System.out.println(i);
		}

		System.out.println();
		
	}

}
