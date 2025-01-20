package javaBasic60;

import java.util.Scanner;

public class proj25_octaltoDecimalConverter {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long octal;
        long decimal = 0;
        int power = 0;
        
        System.out.print("Type any octal number: ");
        octal = sc.nextLong();
        
        while (octal != 0) {
            decimal = (long)(decimal + (octal % 10) * Math.pow(8, power++));
            octal = octal / 10;
        }
        
        System.out.print("The decimal number: " + decimal + "\n");
        
        sc.close();

	}

}
