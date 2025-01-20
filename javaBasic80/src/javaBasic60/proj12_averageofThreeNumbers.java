package javaBasic60;

import java.util.Scanner;

public class proj12_averageofThreeNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter a number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter a number: ");
		int num3 = sc.nextInt();
		int avg = (num1 + num2 + num3)/3;
		
		System.out.println("Average:  " + avg);

		
		sc.close();
	}

}
