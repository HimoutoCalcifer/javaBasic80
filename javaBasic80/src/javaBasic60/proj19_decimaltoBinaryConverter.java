package javaBasic60;

import java.util.Scanner;

public class proj19_decimaltoBinaryConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int decimal, quot, i = 1;
		int binary[] = new int[100];
		        
		System.out.print("Type any Decimal Number: ");
		decimal = sc.nextInt();

		quot = decimal;

		while (quot != 0) {
		    binary[i++] = quot % 2;
		    quot = quot / 2;
		}

		System.out.print("Binary number is: ");
		for (int j = i - 1; j > 0; j--) {
		    System.out.print(binary[j]);
		}
		System.out.println();


        
        sc.close();

	}

}
