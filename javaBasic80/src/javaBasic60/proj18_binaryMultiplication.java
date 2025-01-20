package javaBasic60;

import java.util.Scanner;

public class proj18_binaryMultiplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long bin1, bin2, multiply = 0;
        int digit, factor = 1;
        
        System.out.print("Type first binary number: ");
        bin1 = sc.nextLong();
        
        System.out.print("Type second binary number: ");
        bin2 = sc.nextLong();
        
        while (bin2 != 0) {
            digit = (int)(bin2 % 10);
            if (digit == 1) {
                multiply += bin1 * factor;
            }
            bin1 *= factor;
            bin2 /= 10;
            factor *= 10;
        }
        
        System.out.println("Product: " + multiply);
        
        sc.close();
    }
}
