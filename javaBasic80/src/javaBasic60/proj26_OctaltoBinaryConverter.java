package javaBasic60;

import java.util.Scanner;

public class proj26_OctaltoBinaryConverter {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] octalvalues = {0, 1, 10, 11, 100, 101, 110, 111};
        
        long octal, tempoctal, binary, place_value;
        int remainder;
        
        System.out.print("Type any octal number: ");
        octal = sc.nextLong();
        tempoctal = octal;
        binary = 0;
        place_value = 1;
        
        while (tempoctal != 0) {
            remainder = (int)(tempoctal % 10);
            binary = octalvalues[remainder] * place_value + binary;
            tempoctal /= 10;
            place_value *= 1000;
        }
        
        System.out.print("The binary number: " + binary + "\n");

        sc.close();
	}

}
