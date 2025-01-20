package javaBasic60;

import java.util.Scanner;

public class proj29_HexadecimaltoBinaryConverter {

    public static int convert_hex_to_binary(String letter) {
        String digits = "0123456789ABCDEF";
        letter = letter.toUpperCase();
        int val = 0;

        for (int i = 0; i < letter.length(); i++) {
            char c = letter.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }

        return val;
    }

    public static void main(String[] args) {
        String hexadecimal;
        int decimal, i = 1;
        int bin_num[] = new int[100];
        Scanner sc = new Scanner(System.in);

        System.out.print("Type any Hexadecimal Number: ");
        hexadecimal = sc.nextLine();

        decimal = convert_hex_to_binary(hexadecimal);

        while (decimal != 0) {
            bin_num[i++] = decimal % 2;
            decimal = decimal / 2;
        }

        System.out.print("The Binary Number: ");
        for (int j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }
        System.out.println();
        
        sc.close();
    }
}
