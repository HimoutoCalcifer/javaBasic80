package javaBasic60;

import java.util.Scanner;

public class proj53_NumberComparisonLogic {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Type first number: ");
        int first = sc.nextInt();

        System.out.print("Type second number: ");
        int second = sc.nextInt();

        System.out.print("Type third number: ");
        int third = sc.nextInt();

        System.out.print("Does the last number greater than the previous? - Only(true/false): ");
        boolean ans = sc.nextBoolean();

        System.out.print("The correct result is: " + check(first, second, third, ans));
        
        sc.close();

    }
    
    public static boolean check(int first, int second, int third, boolean ans) {
        if (ans)
            return (third > second);
        return (second > first && third > second);

	}

}
