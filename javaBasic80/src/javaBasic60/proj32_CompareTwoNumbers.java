package javaBasic60;

import java.util.Scanner;

public class proj32_CompareTwoNumbers {
	
	static int num1, num2;

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Type first integer: ");
	        num1 = sc.nextInt(); 

	        System.out.print("Type second integer: ");
	        num2 = sc.nextInt(); 

	        compare();
	        
	        sc.close();

	}

	static void compare() {
        if (num1 == num2)
            System.out.printf("%d == %d\n", num1, num2);
        if (num1 != num2)
            System.out.printf("%d != %d\n", num1, num2);
        if (num1 < num2)
            System.out.printf("%d < %d\n", num1, num2);
        if (num1 > num2)
            System.out.printf("%d > %d\n", num1, num2);
        if (num1 <= num2)
            System.out.printf("%d <= %d\n", num1, num2);
        if (num1 >= num2)
            System.out.printf("%d >= %d\n", num1, num2);
        System.out.println();
        
	}
	
}
