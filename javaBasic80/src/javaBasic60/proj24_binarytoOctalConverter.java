package javaBasic60;

import java.util.Scanner;

public class proj24_binarytoOctalConverter {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long binary;
    	
    	System.out.print("Type any Binary number: ");
    	binary = sc.nextLong();
    	sc.close();
    	
        int octal = convert_binary_to_octal(binary);
        System.out.println("Octal number = " + octal);
    }
    
    public static int convert_binary_to_octal(long binaryNumber) {
        int octalNumber = 0, decimalNumber = 0, i = 0;

        while (binaryNumber != 0) {
          decimalNumber += (binaryNumber % 10) * Math.pow(2, i);
          ++i;
          binaryNumber /= 10;
        }

        i = 1;

        while (decimalNumber != 0) {
          octalNumber += (decimalNumber % 8) * i;
          decimalNumber /= 8;
          i *= 10;
        }

        return octalNumber;
    }
}
