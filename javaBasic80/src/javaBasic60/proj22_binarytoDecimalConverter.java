package javaBasic60;

import java.util.Scanner;

public class proj22_binarytoDecimalConverter {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long binary; 
        long decimal = 0;
        long j = 1; 
        long remainder;
        
        System.out.print("Input here binary number: ");
        binary = sc.nextLong();
        sc.close();

        while (binary != 0) {
            remainder = binary % 10;
            decimal = decimal + remainder * j;
            j = j * 2;
            binary = binary / 10;
        }
        
        System.out.println("Decimal Number: " + decimal);
        
        String temp = Long.toString(binary);
        String bin = "1111";
        int dec = Integer.parseInt(bin, 2);
        System.out.println("Decimal of " + dec);
        
        
        
        
        
        
        
        
        
	}

}
