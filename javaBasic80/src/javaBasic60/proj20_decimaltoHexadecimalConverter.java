package javaBasic60;

import java.util.Scanner;

public class proj20_decimaltoHexadecimalConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int decimal, remainder;
        
        String hexdecimal = "";
        
        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        
        System.out.print("Type any decimal number: ");
        decimal = sc.nextInt();

        while (decimal > 0) {
            remainder = decimal % 16;
            hexdecimal = hex[remainder] + hexdecimal;
            decimal = decimal / 16;
        }
        
        System.out.print("Hexadecimal: " + hexdecimal + "\n");
		
		sc.close();
	}

}
