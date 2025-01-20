package javaBasic60;

import java.util.Scanner;

public class proj6_basicArithmeticOperations {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input first number: ");
		int num1 = sc.nextInt();
		System.out.print("Input second number: ");
		int num2 = sc.nextInt();
		
		int add = num1 + num2;
		int minus = num1 - num2;
		int product = num1 * num2;
		int divide = num1 / num2;
		int mod = num1 % num2;
		
		System.out.println(num1 + " + " + num2 + " = " + add);
		System.out.println(num1 + " - " + num2 + " = " + minus);
		System.out.println(num1 + " x " + num2 + " = " + product);
		System.out.println(num1 + " / " + num2 + " = " + divide);
		System.out.println(num1 + " mod " + num2 + " = " + mod);

		sc.close();
	}

}
