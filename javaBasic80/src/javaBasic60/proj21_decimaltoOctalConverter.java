package javaBasic60;

import java.util.Scanner;

public class proj21_decimaltoOctalConverter {
	
    static void decToOctal(int n) {
        int[] octalNum = new int[100];
        int i = 0;
        while (n != 0) {
            octalNum[i] = n % 8;
            n /= 8;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(octalNum[j]);
        	System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type decimal number: ");
        int n = sc.nextInt();
        sc.close();
        decToOctal(n);
        
    }
}
