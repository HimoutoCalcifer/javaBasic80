package javaBasic60;

import java.util.Scanner;

public class proj52_SumEqualsThirdInteger {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Type first number: ");
        int first = sc.nextInt();

        System.out.print("Type second number: ");
        int second = sc.nextInt();

        System.out.print("Then What is the sum of the two integers? ");
        int thirdsum = sc.nextInt();

        System.out.print("The result is: " + sumoftwo(first, second, thirdsum));

        sc.close();
    }
    
    public static boolean sumoftwo(int first, int second, int thirdsum) {
        return ((first + second) == thirdsum || (second + thirdsum) == first || (thirdsum + first) == second);

	}

}
