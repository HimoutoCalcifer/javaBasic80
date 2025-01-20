package javaBasic60;

import java.util.Scanner;

public class proj64_CommonDigitinNumbers {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Type first number : ");
        int first = sc.nextInt();  

        System.out.print("Type second number: ");
        int second = sc.nextInt();  

        System.out.println("Result: " + common_digit(first, second));
        sc.close();
    }

    public static boolean common_digit(int p, int q) {
        if (p < 25 || q > 75) {
            return false;
        }

        int x = p % 10;
        int y = q % 10;
        p /= 10;
        q /= 10;
        return (p == q || p == y || x == q || x == y);

	}

}
