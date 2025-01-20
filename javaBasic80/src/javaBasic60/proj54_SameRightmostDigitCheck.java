package javaBasic60;

import java.util.Scanner;

public class proj54_SameRightmostDigitCheck {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type first number: ");
        int first = sc.nextInt();

        System.out.print("Type second number: ");
        int second = sc.nextInt();

        System.out.print("Type third number: ");
        int third = sc.nextInt();

        System.out.print("Are there same rightmost/last digit number? - Type only (true/false): ");
        boolean ans = sc.nextBoolean();

        System.out.print("The correct answer is: " + last_digit(first, second, third, ans));

        sc.close();
    }

    public static boolean last_digit(int first, int second, int third, boolean ans) {
        return (first % 10 == second % 10) || (first % 10 == third % 10) || (second % 10 == third % 10);

	}

}
